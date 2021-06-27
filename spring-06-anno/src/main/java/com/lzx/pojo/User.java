package com.lzx.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//组件
@Component
@Scope("singleton")//设置单例
public class User {
    @Value("xixihaha")
    private String name;

    public String getName() {
        return name;
    }
}
