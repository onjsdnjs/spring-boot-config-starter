package io.anymobi.springbootconfigstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class ConfigRunner implements ApplicationRunner {

    @Value("${anymobi.name}")
    private String name;

    @Value("${anymobi.fullName}")
    private String fullName;

    @Value("${anymobi.age}")
    private int age;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(fullName);
        System.out.println(name);
        System.out.println(age);
    }
}
