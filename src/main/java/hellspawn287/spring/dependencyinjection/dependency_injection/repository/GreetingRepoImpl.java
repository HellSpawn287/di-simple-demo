package hellspawn287.spring.dependencyinjection.dependency_injection.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepoImpl implements GreetingRepo {
    @Override
    public String getEnglishGreetings() {
        return "\nHello - Primary Greetings service\n\n";
    }

    @Override
    public String getSpanishGreetings() {
        return "\nServicio de Saludo Primario\n\n";
    }

    @Override
    public String getGermanGreetings() {
        return "\nPrimärer Grußdienst\n\n";
    }
}
