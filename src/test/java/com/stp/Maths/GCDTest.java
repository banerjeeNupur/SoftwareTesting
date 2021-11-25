package com.stp.Maths;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {
    GCD g = new GCD();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void gcdTest(){
        assertEquals(2,g.gcd(2,4),"GCD Test successful");
        assertEquals(2,g.gcd(9,3),"GCD Test successful");
        assertNotEquals(2,g.gcd(3,9));
        assertEquals(8,g.gcd(0,8),"GCD with 0 successful");
        assertEquals(5,g.gcd(5,0),"GCD with 0 successful");
        assertNotEquals(0,g.gcd(0,8));
    }

}