package ppk.springsecondproyect.spring_6_Dependency.controllers;

import ppk.springsecondproyect.spring_6_Dependency.services.GreetingService;

public class PropertyInjectedController
{

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
