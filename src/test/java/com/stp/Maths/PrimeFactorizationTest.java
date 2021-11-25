package com.stp.Maths;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorizationTest {
    PrimeFactorization p = new PrimeFactorization();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void primeFactorization(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,3,5));
        List<Integer> list2 = p.primeFactorization(30);

        assertArrayEquals(list1.toArray(), list2.toArray(),"prime factorization test successful");
        assertNotNull(p.primeFactorization(3));

        list2 = p.primeFactorization(15);
        assertNotEquals(list1.toArray(),list2.toArray());
        List<Integer> list3 = new ArrayList<>();
        assertArrayEquals(list3.toArray(),p.primeFactorization(1).toArray());
    }
}