package com.stp.Sort;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CountingSortTest {
    CountingSort c = new CountingSort();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void countingSortTest(){
        int arr1[] = new int[] {7,2,1,2,1,5};
        int arr2[] = new int[] {1,1,2,2,5,7};
        assertArrayEquals(arr2,c.countingsort(arr1));
        assertNull(c.countingsort(new int[]{}));

    }
}