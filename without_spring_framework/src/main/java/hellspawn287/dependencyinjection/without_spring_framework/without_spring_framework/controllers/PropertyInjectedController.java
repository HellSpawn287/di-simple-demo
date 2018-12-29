package hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.controllers;

import hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
