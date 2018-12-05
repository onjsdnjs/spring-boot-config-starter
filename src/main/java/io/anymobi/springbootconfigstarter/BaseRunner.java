package io.anymobi.springbootconfigstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BaseRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(BaseRunner.class);

    @Autowired
    String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug(hello);

    }
}
