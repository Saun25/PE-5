package com.stackroute;

import java.util.Comparator;

class StudentSorter implements Comparator<Student>{
    int s1=0;
    int s2=0;
    @Override
    public int compare(Student s1,Student s2){

        int NameCompare = s1.getName().compareTo(s2.getName());

        if(s1.getAge()>s2.getAge()){
            return -1;
        }
        else if(s1.getAge()==s2.getAge()){
            if(NameCompare==0){
                if(s1.getId()>s2.getId()){
                    return -1;
                }
                else{
                    return  0;
                }
            }
            else if(NameCompare>0){
                return NameCompare;
            }
            else{
                return NameCompare;
            }
        }
        else{
            return 1;
        }
    }

}
