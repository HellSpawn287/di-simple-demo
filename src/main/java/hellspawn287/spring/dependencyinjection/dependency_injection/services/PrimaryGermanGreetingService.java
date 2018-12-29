package hellspawn287.spring.dependencyinjection.dependency_injection.services;

import hellspawn287.spring.dependencyinjection.dependency_injection.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepo greetingRepoImpl;

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
