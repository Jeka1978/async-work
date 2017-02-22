package com.nice.differentResultExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evegeny on 21/02/2017.
 */
public class Main {
    public static void main(String[] args) {

        new Thread().setDaemon(true);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(11111);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        executorService.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(22222);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
