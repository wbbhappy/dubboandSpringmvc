package com.dubbo.yy.controller;

import com.dubbo.yy.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/sayHello")
    public ModelAndView dataAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        ((ClassPathXmlApplicationContext) applicationContext).start();
        UserService userService = (UserService) applicationContext.getBean("userService",UserService.class);
        ModelAndView view = new ModelAndView();
        view.addObject("yys",userService.sayHello());
        view.setViewName("index");
        return view;
    }

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return userService.say();
    }
}

