package com.stp.Sort;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    InsertionSort i = new InsertionSort();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void insertionSortTest(){
        int arr1[] = new int[] {5,9,3,1,2};
        int arr2[] = new int[] {1,2,3,5,9};
        assertArrayEquals(arr2,i.insertionsort(arr1));
        arr1 = new int[]{9,5,3,2,1};
        assertArrayEquals(arr2,i.insertionsort(arr1));
        arr1 = new int[]{1,2,3,5,9};
        assertArrayEquals(arr2,i.insertionsort(arr1));
        assertNull(i.insertionsort(new int[]{}));
    }
}