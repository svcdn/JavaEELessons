package com.dnsoft.chapter01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        System.out.println("hello gradle!");
        //1.初始化spring容器，加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2.通过容器获取userDao实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //3.调用实例中的say()方法
        userDao.say();
    }
}
