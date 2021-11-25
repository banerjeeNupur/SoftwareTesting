package com.stp.Conversion;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class HexToOctTest {
    HexToOct h = new HexToOct();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void hexToOctTest(){
        assertEquals(17777,h.hextooct("FFFF"));
        assertNotEquals(1234,h.hextooct("FFAE"));
    }
}