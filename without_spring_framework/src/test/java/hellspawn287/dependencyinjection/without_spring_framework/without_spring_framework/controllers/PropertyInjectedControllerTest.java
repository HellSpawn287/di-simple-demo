package hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.controllers;

import hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

@Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_ROBERT, propertyInjectedController.sayHello());
}
}