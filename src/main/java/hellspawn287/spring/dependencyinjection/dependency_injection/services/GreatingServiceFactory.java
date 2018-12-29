package hellspawn287.spring.dependencyinjection.dependency_injection.services;

import hellspawn287.spring.dependencyinjection.dependency_injection.repository.GreetingRepo;

public class GreatingServiceFactory {

    private GreetingRepo greetingRepo;

    public GreatingServiceFactory(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }

    public GreetingService createGreetingService(String language) {
        switch (language) {
            case "en":
                return new PrimaryGreetingService(greetingRepo);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepo);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepo);
            default:
                return new PrimaryGreetingService(greetingRepo);
        }
    }
}
