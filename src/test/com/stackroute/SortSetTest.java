package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortSetTest {

    SortSet sortSet;
    @Before
    public void setUp() throws Exception {
        sortSet = new SortSet();
    }

    @After
    public void tearDown() throws Exception {
        sortSet=null;
    }

    @Test
    public void sortSuccess() {
        Set<String> set = new HashSet<>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertEquals(expected,sortSet.sort(set));
        assertNotNull(sortSet.sort(set));

    }

    @Test
    public void sortFailure() {
        Set<String> set = new HashSet<>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Harry");
        expected.add("Eugene");
        expected.add("Olive");
        assertNotEquals(expected,sortSet.sort(set));
        assertNotNull(sortSet.sort(set));

    }
}