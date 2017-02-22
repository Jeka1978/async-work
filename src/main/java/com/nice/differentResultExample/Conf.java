package com.nice.differentResultExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evegeny on 21/02/2017.
 */
@Configuration
public class Conf {
    @Bean
    public ExecutorService executorService(){
        return Executors.newCachedThreadPool();
    }
}
