package ppk.springsecondproyect.spring_6_Dependency.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello, I'm the Controller");

        return "Hello Controller";
    }
}
