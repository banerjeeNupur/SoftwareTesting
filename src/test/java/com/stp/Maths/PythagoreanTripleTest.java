package com.stp.Maths;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTripleTest {
    PythagoreanTriple p = new PythagoreanTriple();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void pythagoreanTripleTest(){
        assertEquals(true,p.pythagoreantriple(3,4,5),"PythagoreanTriple Test successful");
        assertEquals(false,p.pythagoreantriple(3,6,8));
        assertNotEquals(true,p.pythagoreantriple(6,7,8));
        assertNotEquals(false,p.pythagoreantriple(6,8,10));
    }
}