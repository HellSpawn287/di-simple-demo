package hellspawn287.spring.dependencyinjection.dependency_injection.config;

import hellspawn287.spring.dependencyinjection.dependency_injection.repository.GreetingRepo;
import hellspawn287.spring.dependencyinjection.dependency_injection.services.GreatingServiceFactory;
import hellspawn287.spring.dependencyinjection.dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreatingServiceFactory greatingServiceFactory(GreetingRepo greetingRepo){
        return new GreatingServiceFactory(greetingRepo);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService(GreatingServiceFactory factory){
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"de"})
    GreetingService primaryGermanGreetingService(GreatingServiceFactory factory){
        return factory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService primarySpanishGreetingService(GreatingServiceFactory factory){
        return factory.createGreetingService("es");
    }
}
