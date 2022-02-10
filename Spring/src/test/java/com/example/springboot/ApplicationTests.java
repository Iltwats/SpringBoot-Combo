package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

    @Autowired
    HelloController helloController;


    @Test
    void contextLoads() {}

    @Test
    void version() {
        assertEquals( "The actual version is 1.0.0", helloController.version());
    }

    @Test
    void nationsLength() {
        Integer nationsLength = helloController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = helloController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);


    }
}
