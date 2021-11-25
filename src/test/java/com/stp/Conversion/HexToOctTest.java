package com.stp.Conversion;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class HexToOctTest {
    HexToOct h = new HexToOct();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void hexToOctTest(){
        assertEquals(17777,h.hextooct("FFFF"));
        assertNotEquals(1234,h.hextooct("FFAE"));
    }
}