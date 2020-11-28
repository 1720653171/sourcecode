package com.gqb.mybatissoucecode.config;

import org.apache.ibatis.builder.BuilderException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BuilderException test(){
        System.out.println("初始化类");
        return new BuilderException();
    }


}
