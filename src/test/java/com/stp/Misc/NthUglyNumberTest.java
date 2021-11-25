package com.stp.Misc;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class NthUglyNumberTest {
    NthUglyNumber n = new NthUglyNumber();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void nthUglyNumberTest(){
        assertEquals(8,n.nthUglyNumber(7),"Nth Ugly Number Test Successful");
        assertNotEquals(7,n.nthUglyNumber(7));
        assertEquals(9,n.nthUglyNumber(8));
        assertNotEquals(10,n.nthUglyNumber(8));
        assertEquals(15,n.nthUglyNumber(14));
        assertNotEquals(19,n.nthUglyNumber(14));
    }
}