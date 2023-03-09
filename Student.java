package Student_Mangement_System;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    Student(){

    }

    int roll_no;
    int age;
    String name;
    String division;
    String address;

    int [] marks = new int[5];

    static List<Student> listOfStudent =new ArrayList<>();
    Student(int roll_no,String name,String division,int age,String address,int [] marks){
        this.roll_no=roll_no;
        this.name=name;
        this.division=division;
        this.age=age;
        this.address=address;
        this.marks=marks;
    }
    public String getName() {
        return name;
    }
    public int getRoll_no() {
        return roll_no;
    }
    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public String ttoString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
