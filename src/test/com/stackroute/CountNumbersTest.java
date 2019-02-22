package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountNumbersTest {

    CountNumbers countNumbers;
    @Before
    public void setUp() throws Exception {
        countNumbers = new CountNumbers();
    }

    @After
    public void tearDown() throws Exception {
        countNumbers=null;
    }

    @Test
    public void countSuccess() {
        Map<String,Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        String str= "one one -one___two,,three,one @three*one?two";

        assertEquals(expected,countNumbers.count(str));
        assertNotNull(countNumbers.count(str));
    }

    @Test
    public void countFailure() {
        Map<String,Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 3);
        expected.put("three", 1);
        String str= "one one -one___two,,three,one @three*one?two";

        assertNotEquals(expected,countNumbers.count(str));
        assertNotNull(countNumbers.count(str));
    }
}