package jw.demo.dubbo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
public class GreetingServiceImpl implements GreetingService {

    @ResponseBody
    public User sayHello(String name) {
        User user = new User();
        user.setAge(18);
        user.setUsername(name);
        return user;
    }
}
