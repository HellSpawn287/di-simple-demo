package hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.controllers;

import hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
       return greetingService.sayGreeting();
    }
}
