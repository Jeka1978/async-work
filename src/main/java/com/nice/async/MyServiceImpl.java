package com.nice.async;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * Created by Evegeny on 21/02/2017.
 */
@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private ApplicationContext applicationContext;
    @Override
    @Async("2Threads")
    @SneakyThrows
    public Future<String> doWork(int x){
        for (int i = 0; i < 10; i++) {
            System.out.println(x);
            Thread.sleep(100);
        }
        return new AsyncResult<>("sdd");
    }
    @Override
    public void doStuff(int x){
        MyService proxy = applicationContext.getBean(MyService.class);
        proxy.doWork(x);
    }
}
