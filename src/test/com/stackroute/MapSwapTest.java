package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapSwapTest {

    MapSwap mapSwap;
    @Before
    public void setUp() throws Exception {
        mapSwap = new MapSwap();
    }

    @After
    public void tearDown() throws Exception {
        mapSwap=null;
    }

    @Test
    public void swapSuccess() {
        HashMap<String,String> map = new HashMap<>();
        map.put("val1", "Java");
        map.put("val2", "C++");

        HashMap<String,String> expected = new HashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "Java");


        assertEquals(expected,mapSwap.swap(map));
        assertNotNull(mapSwap.swap(map));
    }

    @Test
    public void swapSuccess1() {
        HashMap<String,String> map = new HashMap<>();
        map.put("val1", "Mars");
        map.put("val2", "Saturn");

        HashMap<String,String> expected = new HashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "Mars");


        assertEquals(expected,mapSwap.swap(map));
        assertNotNull(mapSwap.swap(map));
    }

    @Test
    public void swapFailure() {
        HashMap<String,String> map = new HashMap<>();
        map.put("val1", "Java");
        map.put("val2", "C++");

        HashMap<String,String> expected = new HashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "C++");


        assertNotEquals(expected,mapSwap.swap(map));
        assertNotNull(mapSwap.swap(map));
    }

    @Test
    public void swapFailure1() {
        HashMap<String,String> map = new HashMap<>();
        map.put("val1", "Mars");
        map.put("val2", "Saturn");

        HashMap<String,String> expected = new HashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "Saturn");


        assertNotEquals(expected,mapSwap.swap(map));
        assertNotNull(mapSwap.swap(map));
    }
}