package hellspawn287.spring.dependencyinjection.dependency_injection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBeanLifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

    public SpringBeanLifeCycleDemo() {
        System.out.println("\t #1 Instantiate\n\t    {{I'm in the SpringBeamLifeCycleDemo constructor}}\n");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("\t #2 Setting bean name\n\t    My Bean name is: " + name + "\n");
    }

    @Override
    public void destroy() {
        System.out.println("\t #9 Bean TERMINATION\n\t    The spring bean life cycle has been terminated.\n");

    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("\t #6 Setting bean properties\n\t    The SpringBeamLifeCycleDemo has its properties set.\n");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("\t #3 Setting Context\n\t    The Application Context has been set.\n");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("\t #5 \n\t    The Post Construct annotated method has been called.\n");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("\t #8 Preparation for bean termination\n\t    The Pre-destroy annotated method has been called.\n");
    }

    public void beforeInit() {
        System.out.println("\t #4 Pre Initialization\n\t    Before Init - Called by Bean Post Processor.\n");
    }

    public void afterInit() {
        System.out.println("\t #7 Post Initialization\n\t    After Init - Called by Bean Post Processor.\n");
    }
}
