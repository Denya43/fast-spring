package config;

import aop.LoggingEntryAspect;
import aop.LoggingExitAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "beans")
@EnableAspectJAutoProxy
public class MyConfig {

    @Bean
    public LoggingExitAspect loggingExitAspect() {
        return new LoggingExitAspect();
    }

    @Bean
    public LoggingEntryAspect loggingEntryAspect() {
        return new LoggingEntryAspect();
    }
}
