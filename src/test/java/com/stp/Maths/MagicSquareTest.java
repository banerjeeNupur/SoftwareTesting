package com.stp.Maths;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MagicSquareTest {

    MagicSquare m = new MagicSquare();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void magicSquareTest(){
        int [][] arr1 = {{2,7,6},{9,5,1},{4,3,8}};
        assertTrue(Arrays.deepEquals(arr1, m.magicsquare(3)));
        assertFalse(Arrays.deepEquals(arr1,m.magicsquare(2)));
        assertNull(m.magicsquare(0));
        assertNotNull(m.magicsquare(5));
    }
}