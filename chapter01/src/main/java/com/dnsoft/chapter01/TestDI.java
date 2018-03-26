package com.dnsoft.chapter01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    public static void main(String[] args) {
        System.out.println("TestDI");

        //1.初始化spring容器，加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2.通过容器获取UserService实例
        UserService userService =
                (UserService) applicationContext.getBean("userService");
        //3.调用实例中的say()方法
        userService.say();

    }
}
