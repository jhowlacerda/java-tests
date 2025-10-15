package com.tdd;

import org.junit.jupiter.api.*;

//@Order(2)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {

    StringBuilder actualValue = new StringBuilder("");

    @AfterEach
    void afterEach(){
        System.out.println("the actual value is: " + actualValue);
    }
    @Test
    @Order(1)
    void testB(){
        System.out.println("testB");
        actualValue.append(1);
    }
    @Test
    @Order(2)
    void testC(){
        System.out.println("testC");
        actualValue.append(2);
    }
    @Test
    @Order(0)
    void testA(){
        System.out.println("testA");
        actualValue.append(0);

    }
    @Test
    @Order(4)
    void testF(){
        System.out.println("testF");
        actualValue.append(4);

    }
    @Test
    @Order(3)
    void testD(){
        System.out.println("testD");
        actualValue.append(3);

    }

}
