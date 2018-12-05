package io.anymobi.springbootconfigstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class PropertiesConfigRunner implements ApplicationRunner {

    @Autowired
    AnymobiProperties anymobiProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(anymobiProperties.getFullName());
        System.out.println(anymobiProperties.getName());
        System.out.println(anymobiProperties.getAge());
    }
}
