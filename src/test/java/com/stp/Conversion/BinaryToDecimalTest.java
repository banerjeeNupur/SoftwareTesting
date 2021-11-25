package com.stp.Conversion;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {
    BinaryToDecimal b = new BinaryToDecimal();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }
    @Test
    void binartToDecimalTest(){
        assertEquals(4,b.binarytodecimal(100),"Binary to Decimal Conversion Successful");
        assertNotEquals(4,b.binarytodecimal(10));
        assertEquals(0,b.binarytodecimal(0));
    }
}