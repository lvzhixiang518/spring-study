package com.lzx.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("usert被创建了");
    }

    public void show(){
        System.out.println("name="+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
