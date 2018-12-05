package io.anymobi.springbootconfigstarter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:/test.properties")
//@SpringBootTest(properties = "anymobi.name=anymobi11")
@SpringBootTest()
public class SpringBootConfigStarterApplicationTest {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads(){
        assertThat(environment.getProperty("anymobi.name"))
                .isEqualTo("anymobi10");
    }

}