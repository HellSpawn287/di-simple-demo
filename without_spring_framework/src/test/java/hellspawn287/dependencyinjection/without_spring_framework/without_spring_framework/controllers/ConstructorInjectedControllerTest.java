package hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.controllers;

import hellspawn287.dependencyinjection.without_spring_framework.without_spring_framework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_ROBERT, constructorInjectedController.sayHello());
    }
}