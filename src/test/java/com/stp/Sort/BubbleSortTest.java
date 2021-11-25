package com.stp.Sort;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    BubbleSort b = new BubbleSort();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void bubbleSortTest(){
        int arr1[] = new int[] {7,2,1,5,9};
        int arr2[] = new int[] {1,2,5,7,9};
        assertArrayEquals(arr2,b.bubblesort(arr1));
        assertNull(b.bubblesort(new int[]{}));

    }
}