package config;

import aop.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "beans")
@EnableAspectJAutoProxy
public class MyConfig {

//    @Bean
//    public CustomFrame customFrame() {
//        return new CustomFrame();
//    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
