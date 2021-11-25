package com.stp.Conversion;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnyToAnyTest {
    AnyToAny a = new AnyToAny();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void anyToAnyTest(){
        assertEquals(5,a.anyToAny(101,2,10),"any to any test successful");
        assertNotEquals(6,a.anyToAny(101,2,10));
    }
}