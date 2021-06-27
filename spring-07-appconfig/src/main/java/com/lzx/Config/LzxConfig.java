package com.lzx.Config;

import com.lzx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan
@Import(LzxConfig2.class)
public class LzxConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
