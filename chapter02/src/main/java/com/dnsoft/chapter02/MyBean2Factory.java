package com.dnsoft.chapter02;

public class MyBean2Factory {
    //使用自己的工厂创建Bean2实例
    public static Bean2 createBean(){
        return new Bean2();
    }
}
