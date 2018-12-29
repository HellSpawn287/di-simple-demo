package hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_ROBERT =
            ">>>>>>>>\n \t\tHello Robert. Nice to see you! \n \t\t\t\t:) \n \t\tHappy coding \n\n";
    @Override
    public String sayGreeting() {
        return HELLO_ROBERT;
    }
}
