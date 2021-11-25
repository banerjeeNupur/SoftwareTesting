package com.stp.Search;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SearchLinearTest {
    SearchLinear l = new SearchLinear();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void binarySearchTest(){
        int arr[] = new int[] {5,9,2,-1,100};

        assertEquals(0,l.linearsearch(arr,5),"Linear Search Test successful");
        assertEquals(4,l.linearsearch(arr,100));
        assertEquals(-1,l.linearsearch(arr,7));
    }
}