package hellspawn287.spring.dependencyinjection.dependency_injection.controllers;

import hellspawn287.spring.dependencyinjection.dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        //System.out.println("\n \t\tHello Robert. Nice to see you! \n \t\t\t\t:) \n \t\tHappy coding \n");
        return greetingService.sayGreeting();
    }
}
