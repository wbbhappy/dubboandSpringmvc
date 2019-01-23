package com.dubbo.yy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
/**
 * 启动生产者提供的服务
 *
 */
public class Provider {
    public static void main( String[] args ) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext-dubbo.xml");
        ((ClassPathXmlApplicationContext) applicationContext).start();
        System.out.println( "生产者提供的服务已启动！" );
        System.in.read();
    }
}
