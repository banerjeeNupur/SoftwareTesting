package com.stp.Misc;

import com.stp.Misc.LeapYear;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    LeapYear l = new LeapYear();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void leapYearTest(){
        assertEquals(true,l.leapyear(2000),"Leap Year Test Successful");
        assertEquals(false, l.leapyear(1998));
        assertTrue(l.leapyear(2008));
        assertFalse(l.leapyear(1700));
    }
}