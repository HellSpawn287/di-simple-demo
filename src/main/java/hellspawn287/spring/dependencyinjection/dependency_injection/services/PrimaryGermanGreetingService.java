package hellspawn287.spring.dependencyinjection.dependency_injection.services;

import hellspawn287.spring.dependencyinjection.dependency_injection.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepo greetingRepoImpl;

    public PrimaryGermanGreetingService(GreetingRepo greetingRepoImpl) {
        this.greetingRepoImpl = greetingRepoImpl;
    }

    @Override
    public String sayGreeting() {
        return greetingRepoImpl.getGermanGreetings();
    }

    @Autowired
    @Qualifier("greetingRepoImpl")
    public void setGreetingRepoImpl(GreetingRepo greetingRepoImpl) {
        this.greetingRepoImpl = greetingRepoImpl;
    }
}
