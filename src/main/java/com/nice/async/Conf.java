package com.nice.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evegeny on 21/02/2017.
 */
@Configuration
@EnableAsync
public class Conf {
    @Bean("2Threads")
    public ExecutorService executorService(){
        return Executors.newFixedThreadPool(2);
    }
}
