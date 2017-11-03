package jw.demo.dubbo.controller;

import jw.demo.dubbo.GreetingService;
import jw.demo.dubbo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    @ResponseBody
    @RequestMapping("/speak")
    public User sayHello(String name) {
        return greetingService.sayHello(name);
    }
}
