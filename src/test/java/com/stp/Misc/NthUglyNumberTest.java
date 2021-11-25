package com.stp.Misc;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class NthUglyNumberTest {
    NthUglyNumber n = new NthUglyNumber();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void nthUglyNumberTest(){
        assertEquals(8,n.nthUglyNumber(7));
        assertNotEquals(7,n.nthUglyNumber(7));
        assertEquals(9,n.nthUglyNumber(8));
        assertNotEquals(10,n.nthUglyNumber(8));
        assertEquals(15,n.nthUglyNumber(14));
        assertNotEquals(16,n.nthUglyNumber(14));
    }
}