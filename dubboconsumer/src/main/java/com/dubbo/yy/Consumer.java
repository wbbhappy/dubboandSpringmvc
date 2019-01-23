package com.dubbo.yy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 启动消费者
 */
public class Consumer {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        ((ClassPathXmlApplicationContext) applicationContext).start();
        UserService userService = (UserService) applicationContext.getBean("userService",UserService.class);
        System.out.println(userService.say());
        //System.out.println(userService.sayHello());
    }
}
