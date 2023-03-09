package Student_Mangement_System;
import java.util.*;

public class AddStudent extends Student implements Runnable{

    Scanner sc = new Scanner(System.in);
    AddStudent(){

    }
    int a=0;
    @Override
    public void run() {
        Student s1;
        System.out.println("PLEASE ADD BELOW DATA");
        System.out.println("Roll NO\nNAME\nDIVISION\nAGE\nADDRESS");
        int roll_no = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String division = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String address = sc.nextLine();
        for(Student s:listOfStudent){
            if(s.roll_no==roll_no){
                try {
                    a=1;
                    throw new DuplicateStudentException();
                } catch (DuplicateStudentException e) {

                }
            }
        }

        if(a==0) {

            listOfStudent.add(new Student(roll_no, name, division, age, address,marks));
        }
    }

}
