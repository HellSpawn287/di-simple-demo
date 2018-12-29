package hellspawn287.spring.dependencyinjection.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return ">>>>>>>>\n \t\tHello Robert. Nice to see you! \n \t\t\t\tI WAS INJECTED VIA THE SETTER! \n \t\tHappy coding \n\n";
    }
}
