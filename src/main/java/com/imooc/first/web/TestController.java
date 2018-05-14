package com.imooc.first.web;

import com.imooc.first.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
@RequestMapping("test")
public class TestController {

//    @Autowired
//    private TaskExecutor taskExecutor;

    public void executeAsynchronously() {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(DateUtils.getCurrentTime());
            }
        });
    }

    @RequestMapping("/error")
    public String error()
    {
        printMessages();
        return "123";
    }


    private TaskExecutor taskExecutor;
    public void MainExecutor (TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }
    public void printMessages() {
        for(int i = 0; i < 25; i++) {
            taskExecutor.execute(new MessagePrinterTask("Message" + i));
        }
    }


    private class MessagePrinterTask implements Runnable {
        private String message;
        public MessagePrinterTask(String message) {
            this.message = message;
        }
        public void run() {
            System.out.println(message);
        }
    }
}
