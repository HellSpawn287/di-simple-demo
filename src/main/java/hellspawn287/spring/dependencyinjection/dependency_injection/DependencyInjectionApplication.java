package hellspawn287.spring.dependencyinjection.dependency_injection;

import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.ConstructorInjectedController;
import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.MyController;
import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.PropertyInjectedController;
import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // this annotation by DEFAULT is going to do a Component Scan from 'hellspawn287.spring.dependencyinjection.dependency_injection' path.
//@ComponentScan(basePackages = {"hellspawn287.spring.dependencyinjection"}) is helpful when you declare something outside the Spring Boot Structure. You can tell Spring to scan specific package or packages.
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
    }
}
