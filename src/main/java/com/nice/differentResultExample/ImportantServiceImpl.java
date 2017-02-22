package com.nice.differentResultExample;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 21/02/2017.
 */
@Service
public class ImportantServiceImpl implements ImportantService {
    @Override
    @SneakyThrows
    public String getPurposeOfLife() {
        Thread.sleep(9000);
        return "42";
    }
}
