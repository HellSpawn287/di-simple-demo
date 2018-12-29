package hellspawn287.spring.dependencyinjection.dependency_injection.services;

import hellspawn287.spring.dependencyinjection.dependency_injection.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepo greetingRepoImpl;

    @Autowired
    public PrimaryGreetingService(@Qualifier(value = "greetingRepoImpl") GreetingRepo greetingRepoImpl) {
        this.greetingRepoImpl = greetingRepoImpl;
    }

    public String sayGreeting() {
        return greetingRepoImpl.getEnglishGreetings();
    }

   /* @Qualifier("greetingRepoImpl")
    public void setGreetingRepoImpl(GreetingRepo greetingRepoImpl) {
        this.greetingRepoImpl = greetingRepoImpl;
    }*/
}
