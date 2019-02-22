/*Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.*/

package com.stackroute;

/**
 *
 * this class only contains the Student data,and getter setter methods to access the Student data
 */
public class Student {
    private int id;
    private String name;
    private int age;

    Student(int id,String name,int age){
        this.id =id;
        this.name=name;
        this.age=age;
    }
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }



}
