package ppk.springsecondproyect.spring_6_Dependency.controllers;

import org.springframework.stereotype.Controller;
import ppk.springsecondproyect.spring_6_Dependency.services.GreetingService;
import ppk.springsecondproyect.spring_6_Dependency.services.GreetingServiceImpl;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Hello, I'm the Controller");

        return greetingService.sayGreeting();
    }
}
