package com.dnsoft.aspectj.annotation;

import com.dnsoft.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 测试类
public class TestAnnotationAspectj {
    public static void main(String args[]) {
        String xmlPath =
                "classpath:AspectjAnnotationContext.xml";
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(xmlPath);
        // 1 从spring容器获得内容
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        // 2 执行方法
        userDao.addUser();
    }
}
