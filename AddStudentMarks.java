package Student_Mangement_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class AddStudentMarks extends Student implements Runnable {
    Scanner sc = new Scanner(System.in);

    int marksheetId;
    int roll;

    static boolean flag1=false;

    @Override
    public void run() {
        System.out.println("ENTER YOUR STUDENT ID");
        marksheetId=sc.nextInt();
        System.out.println("ENTER YOUR ROLL NUMBER");
        roll=sc.nextInt();
        for(Student s:listOfStudent){
            if(s.roll_no==roll){
                flag1=true;
            }
        }
        if(flag1) {
            System.out.println("ENTER TOUR MARKS FOR MATHS-PHYSICS-CHEMISTRY-ENGLISH-HINDI");
            for(Student s:listOfStudent){
                if(s.roll_no==roll){
                    for (int i = 0; i < 5; i++) {
                        int x = sc.nextInt();
                        if(x<0 || x>100){
                            try {
                                throw new MarksNotInRangeException();
                            } catch (MarksNotInRangeException e) {

                            }
                        }else {
                            s.marks[i] = x;
                        }
                    }
                    int x=0;
                    for(int i=0;i<5;i++){
                        if(s.marks[i]<35){
                            x++;
                        }
                    }
                    if(x==1){
                        for(int i=0;i<5;i++){
                            if(s.marks[i]<35){
                                s.marks[i]+=5;
                            }
                        }
                    }
                }
            }

        }else try {
                throw new StudentnNotExistException();
            } catch (StudentnNotExistException e) {

        }




    }
}
