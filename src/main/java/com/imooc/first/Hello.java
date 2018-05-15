package com.imooc.first;

import com.imooc.first.dao.AreaDao;
import com.imooc.first.model.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

@RestController
public class Hello {
    @Autowired
    private AreaDao areaDao;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "hello";
    }

    public static void main(String[] args) {

        //CompletableFuture.supplyAsync
//        thenApply();
//        thenAccept();
        thenRun();
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


}
