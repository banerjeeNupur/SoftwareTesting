package com.stp.Conversion;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class AnyToAnyTest {
    AnyToAny a = new AnyToAny();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void anyToAnyTest(){
        assertEquals(5,a.anyToAny(101,2,10),"any to any test successful");
        assertNotEquals(6,a.anyToAny(101,2,10));
    }
}