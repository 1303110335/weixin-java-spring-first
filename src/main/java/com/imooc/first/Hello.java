package com.imooc.first;

import com.imooc.first.dao.AreaDao;
import com.imooc.first.model.Area;
import com.imooc.first.service.core.impl.SUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@RestController
public class Hello {
    @Autowired
    private AreaDao areaDao;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "hello";
    }

    public static void main(String[] args) {



    }

    public static Integer incre(Integer num)
    {
        return num + 1;
    }

    public static void thenApply() {
        String result = CompletableFuture.supplyAsync(() -> "hello").thenApply(s -> s + " world").join();
        System.out.println(result);
    }

    public static void thenAccept(){
        CompletableFuture.supplyAsync(() -> "hello").thenAccept(s -> System.out.println(s+" world"));
    }

    public static void thenRun(){
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        }).thenRun(() -> System.out.println("hello world"));
        while (true){}
    }

    public static void streamTest()
    {
        List<Integer> nums = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(5);
        nums.add(3);
        nums.add(9);
        nums.add(2);
        nums.add(null);
        nums.add(7);

        nums = nums.stream().filter(m -> m != null)
                .peek(m -> {nums2.add(m);})
                .map(Hello::incre)
                .skip(1)
                .sorted()
                .distinct()
                .limit(3)
                .collect(Collectors.toList());


        System.out.println(nums);
    }


    public static void testCalendar()
    {
        Calendar expireTimeCalendar = Calendar.getInstance();
        System.out.println(expireTimeCalendar.getTime());
        expireTimeCalendar.add(Calendar.HOUR, 10);
        System.out.println(expireTimeCalendar.getTime());
    }

}
