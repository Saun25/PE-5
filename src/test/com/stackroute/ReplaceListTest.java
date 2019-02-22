package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReplaceListTest {

    ReplaceList replaceList;
    @Before
    public void setUp() throws Exception {
        replaceList=new ReplaceList();
    }

    @After
    public void tearDown() throws Exception {
        replaceList= null;
    }

    @Test
    public void replaceElementSuccess() {
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("kiwi");
        expectedList.add("grape");
        expectedList.add("mango");
        expectedList.add("berry");

        ArrayList<String> actualList = new ArrayList<>();
        actualList.add("apple");
        actualList.add("grape");
        actualList.add("melon");
        actualList.add("berry");

        assertEquals(expectedList,replaceList.replaceElement(actualList));
        assertNotNull(replaceList.replaceElement(actualList));
    }

    @Test
    public void replaceElementFailure() {
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("kiwi");
        expectedList.add("grape");
        expectedList.add("melon");
        expectedList.add("berry");

        ArrayList<String> actualList = new ArrayList<>();
        actualList.add("apple");
        actualList.add("grape");
        actualList.add("melon");
        actualList.add("berry");

        assertNotEquals(expectedList,replaceList.replaceElement(actualList));
        assertNotNull(replaceList.replaceElement(actualList));
    }

    @Test
    public void emptyStringSuccess() {
        ArrayList<String> actualList = new ArrayList<>();
        actualList.add("apple");
        actualList.add("grape");
        actualList.add("melon");
        actualList.add("berry");

        assertEquals(true,replaceList.emptyString(actualList));
        assertNotNull(replaceList.emptyString(actualList));
    }

    @Test
    public void emptyStringFailure() {
        ArrayList<String> actualList = new ArrayList<>();
        actualList.add("apple");
        actualList.add("grape");
        actualList.add("melon");
        actualList.add("berry");

        assertNotEquals(false,replaceList.emptyString(actualList));
        assertNotNull(replaceList.emptyString(actualList));
    }
}