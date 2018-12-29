package hellspawn287.spring.dependencyinjection.dependency_injection.services;

import hellspawn287.spring.dependencyinjection.dependency_injection.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepo greetingRepoImpl;

    @Autowired
    public PrimarySpanishGreetingService(@Qualifier("greetingRepoImpl") GreetingRepo greetingRepoImpl) {
        this.greetingRepoImpl = greetingRepoImpl;
    }

    @Override
    public String sayGreeting() {
        return greetingRepoImpl.getSpanishGreetings();
    }
}
