package hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.controllers;

import hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
