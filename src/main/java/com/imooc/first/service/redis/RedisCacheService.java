package com.imooc.first.service.redis;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Service("RedisCacheService")
public class RedisCacheService {
    @Resource(name = "redisTemplate")
    private ListOperations<String, String> messageList;
    @Resource(name = "redisTemplate")
    private RedisOperations<String, String> latestMessageExpiration;
    @Resource(name = "redisTemplate")
    private ValueOperations<String, String> kvstore;
    @Resource(name = "redisTemplate")
    private ValueOperations<String, Object> keyValueStore;
    @Resource(name = "redisTemplate")
    private HashOperations<String, String, String> hashOperations;

    public void putObject(String key, Object value) {
        keyValueStore.set(key, value);
    }

    public Object getObject(String key) {
        return keyValueStore.get(key);
    }

    public void del(String key) {
        latestMessageExpiration.delete(key);
    }

    public void put(String key, String value) {
        kvstore.set(key, value);
    }

    public String getAndSet(String key, String value, long liveTime) {

        String a = kvstore.getAndSet(key, value);
        latestMessageExpiration.expire(key, liveTime, TimeUnit.SECONDS);
        return a;

    }

    public void put(String key, String value, long expire) {
        kvstore.set(key, value, expire, TimeUnit.SECONDS);
    }

    public void put(String key, String value, long expire, TimeUnit timeUnit) {
        kvstore.set(key, value, expire, timeUnit);
    }

    public String get(String key) {
        return kvstore.get(key);
    }

    public long incr(String key) {
        return kvstore.increment(key, 1);
    }

    public boolean exists(String key) {
        return latestMessageExpiration.hasKey(key);
    }

    public Set<String> keys(String pattern) {
        return latestMessageExpiration.keys(pattern);
    }

    public void addMessage(String user, String message) {
        messageList.leftPush(user, message);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Date date = Date.from(zonedDateTime.plus(3, ChronoUnit.MINUTES).toInstant());
        latestMessageExpiration.expireAt(user, date);
    }

    public List<String> listMessages(String user) {
        return messageList.range(user, 0, -1);
    }

    public boolean setIfAbsent(String key, String value, long expireTime) {
        boolean result = keyValueStore.setIfAbsent(key, value);
        if (result) {
            latestMessageExpiration.expire(key, expireTime, TimeUnit.SECONDS);
        }
        return result;
    }

    /**
     * @param key
     * @param field
     * @param value
     * @param expire 过期时间，秒
     */
    public void hSet(String key, String field, String value, long expire) {
        hashOperations.put(key, field, value);
        if (expire != 0)
            expire(key, expire);
    }

    public String hGet(String key, String field) {
        return hashOperations.get(key, field);
    }

    public Boolean hExist(String key, String field) {
        return hashOperations.hasKey(key, field);
    }

    public void hDel(String key, String field) {
        hashOperations.delete(key, field);
    }

    public Map<String, String> hGetAll(String key) {
        return hashOperations.entries(key);
    }

    public void expire(String key, long expire) {
        latestMessageExpiration.expire(key, expire, TimeUnit.SECONDS);
    }

}