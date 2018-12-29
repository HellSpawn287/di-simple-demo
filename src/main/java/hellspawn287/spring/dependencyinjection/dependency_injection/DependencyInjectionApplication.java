package hellspawn287.spring.dependencyinjection.dependency_injection;

import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.ConstructorInjectedController;
import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.MyController;
import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.PropertyInjectedController;
import hellspawn287.spring.dependencyinjection.dependency_injection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
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
