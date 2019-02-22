package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapStringsTest {

    MapStrings mapStrings;
    @Before
    public void setUp() throws Exception {
        mapStrings=new MapStrings();
    }

    @After
    public void tearDown() throws Exception {
        mapStrings=null;
    }

    @Test
    public void mappingSuccess() {
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String arr[] = {"a","b","c","d","a","c","c"};

        assertEquals(expected,mapStrings.mapping(arr));
        assertNotNull(mapStrings.mapping(arr));
    }

    @Test
    public void mappingFailure() {
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", false);
        expected.put("d", false);
        String arr[] = {"a","b","c","d","a","c","c"};

        assertNotEquals(expected,mapStrings.mapping(arr));
        assertNotNull(mapStrings.mapping(arr));

    }
}