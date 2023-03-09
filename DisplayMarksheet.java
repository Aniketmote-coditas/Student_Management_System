package Student_Mangement_System;

import java.util.Scanner;

public class DisplayMarksheet extends Student implements Runnable{
    Scanner sc = new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("ENTER THE ROLL NUMBER FOR WHICH YOU WANT MARKSHEET");
        int roll = sc.nextInt();
        for(Student s:listOfStudent){
            if(s.roll_no==roll){
                int v=0;
                for(int i=0;i<5;i++){
                    if(s.marks[i]<35){
                        v++;
                    }
                }
                System.out.println(s.ttoString());
                if(v!=0){
                    System.out.println("YOU ARE FAIL IN "+v+ " SUBJECT");
                }else{
                    System.out.println("YOU ARE PASS IN ALL THE SUBJECT");
                }
            }else try {
                    throw new StudentnNotExistException();
                } catch (StudentnNotExistException e) {
                    throw new RuntimeException(e);
                }

        }
    }
}
