package com.tdd;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(1)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderedByNameTest {
    @Test
    void testB(){
        System.out.println("testB");
    }
    @Test
    void testC(){
        System.out.println("testC");
    }
    @Test
    void testA(){
        System.out.println("testA");
    }
    @Test
    void testF(){
        System.out.println("testB");
    }
    @Test
    void testD(){
        System.out.println("testC");
    }

}
