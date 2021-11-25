package com.stp.Maths;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTest {
    PrimeFactorization p = new PrimeFactorization();
    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void primeFactorization(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,3,5));
        List<Integer> list2 = p.primeFactorization(30);

        assertArrayEquals(list1.toArray(), list2.toArray(),"prime factorization test successful");
        assertNotNull(p.primeFactorization(3));

        list2 = p.primeFactorization(15);
        assertNotEquals(list1.toArray(),list2.toArray());

        assertNull(p.primeFactorization(1));
    }
}