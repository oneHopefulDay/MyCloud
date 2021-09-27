package com.zjipst.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author songhao
 */
public class DefaultFeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.BASIC;
    }

}
