package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {

    MainTest mainTest;
    @Before
    public void setUp() throws Exception {
        mainTest=new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mainTest=null;
    }

    @Test
    public void test1() {

        ArrayList<Student> list = new ArrayList<>();
        Student s1 =new Student(1,"Subhojit",23);
        Student s2=new Student(2,"Aman",40);
        Student s3=new Student(3,"Aprajita",50);
        Student s4=new Student(4,"Saunak",25);
        Student s5 =new Student(5,"Subhojit",23);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        ArrayList<Student> exlist = new ArrayList<>();
        exlist.add(s3);
        exlist.add(s2);
        exlist.add(s4);
        exlist.add(s5);
        exlist.add(s1);

        assertEquals(exlist,mainTest.test(list));
    }
}