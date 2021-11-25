package com.stp.Search;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SearchBinaryTest {
    SearchBinary b = new SearchBinary();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void binarySearchTest(){
        int arr[] = new int[] {4,7,9,15,17};

        assertEquals(4,b.binarysearch(arr,17),"Binary Search Test successful");
        assertEquals(2,b.binarysearch(arr,9));
        assertEquals(0,b.binarysearch(arr,0));
        assertEquals(-1,b.binarysearch(arr,8));
    }
}