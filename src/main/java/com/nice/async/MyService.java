package com.nice.async;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

/**
 * Created by Evegeny on 21/02/2017.
 */
public interface MyService {
    @Async
    @SneakyThrows
    Future<String> doWork(int x);

    void doStuff(int x);
}
