package Student_Mangement_System;
import java.util.*;
public class DisplayStudent extends Student implements Runnable{
    DisplayStudent(){

    }

    public void run(){
        Collections.sort(listOfStudent,new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        for(Student s:listOfStudent) {
            System.out.println(s);
        }
    }
}
