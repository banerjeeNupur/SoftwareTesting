package com.stp.Calender;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    LeapYear l = new LeapYear();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void leapYearTest(){
        assertEquals(true,l.leapyear(2000),"Leap Year Test Successful");
        assertEquals(false, l.leapyear(1998));
        assertTrue(l.leapyear(2008));
        assertFalse(l.leapyear(1700));
    }
}