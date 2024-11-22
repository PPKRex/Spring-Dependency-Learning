package ppk.springsecondproyect.spring_6_Dependency.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
    }


    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}