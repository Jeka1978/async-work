package com.nice.callable;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;

/**
 * Created by Evegeny on 22/02/2017.
 */
@AllArgsConstructor
public class MyTask implements Callable<Integer> {
    private int core;
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getId());
        return core*10;
    }
}
