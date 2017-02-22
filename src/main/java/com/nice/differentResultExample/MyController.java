package com.nice.differentResultExample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.ExecutorService;

/**
 * Created by Evegeny on 21/02/2017.
 */
@RestController
@Slf4j
public class MyController {

    @Autowired
    private ImportantService service;

    @Autowired
    private ExecutorService executorService;

    @GetMapping("/bestNumber")
    public String getBestNumber(){
        log.info("METHOD bestNumber was finished");
        System.out.println("METHOD bestNumber was finished");
        return "73";
    }

    @GetMapping("/purpose")
    public DeferredResult<String> purpose(){
        DeferredResult<String> deferredResult = new DeferredResult<>();
        executorService.submit(() -> {
            String purposeOfLife = service.getPurposeOfLife();
            deferredResult.setResult(purposeOfLife);
        });

//        new Thread(() -> ).start();
        return deferredResult;
    }
}









