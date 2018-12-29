package hellspawn287.spring.dependencyinjection.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_ROBERT =
            ">>>>>>>>\n \t\tHello Robert. Nice to see you! \n \t\t\tThat's the ORIGIN :)\n \t\tI WAS INJECTED VIA THE PROPERTY\n \t\tBY USING REFLECTION AT RUNTIME\n \t\tI AM A BAD PRACTICE\n\n \t\tHappy coding \n\n";
    @Override
    public String sayGreeting() {
        return HELLO_ROBERT;
    }
}
