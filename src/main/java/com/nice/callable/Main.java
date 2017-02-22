package com.nice.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Evegeny on 22/02/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<MyTask> myTasks = new ArrayList<>();
        myTasks.add(new MyTask(20));
        myTasks.add(new MyTask(25));
        myTasks.add(new MyTask(26));
        List<Future<Integer>> futures = executorService.invokeAll(myTasks);
        /*for (Future<Integer> future : futures) {
            Integer integer = future.get();
            System.out.println("integer = " + integer);
        }*/
    }
}
