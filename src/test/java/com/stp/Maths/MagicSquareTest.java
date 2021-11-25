package com.stp.Maths;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {

    MagicSquare m = new MagicSquare();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void magicSquareTest(){
        int [][] arr1 = {{2,7,6},{9,5,1},{4,3,8}};
        assertTrue(Arrays.deepEquals(arr1, m.magicsquare(3)));
        assertFalse(Arrays.deepEquals(arr1,m.magicsquare(2)));
        assertNull(m.magicsquare(0));
        assertNotNull(m.magicsquare(5));
    }
}