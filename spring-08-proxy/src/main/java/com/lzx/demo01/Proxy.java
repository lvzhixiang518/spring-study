package com.lzx.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }
    public Proxy() {
    }

    @Override
    public void rent() {
        sesHouse();
        host.rent();
        shouFei();
    }

    public void sesHouse(){
        System.out.println("中介带你看房");
    }

    public void shouFei(){
        System.out.println("中介收费");
    }
}
