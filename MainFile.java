package Student_Mangement_System;

import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
        boolean flag = true;
        while (flag){

            AddStudent addStudent = new AddStudent();
            Thread t1 = new Thread(addStudent);

            DisplayStudent displayStudent = new DisplayStudent();
            Thread t2 = new Thread(displayStudent);

            AddStudentMarks addStudentMarks = new AddStudentMarks();
            Thread t3 = new Thread(addStudentMarks);

            DisplayMarksheet displayMarksheet = new DisplayMarksheet();
            Thread t4 = new Thread(displayMarksheet);

            System.out.println("PRESS 1 FOR ADD STUDENT\nPRESS 2 FOR DISPLAY STUDENT\nPRESS 3 FOR ADD STUDENT MARKS\nPRESS 4 FOR DISPLAY STUDENT MARKSHEET\nPRESS 0 FOR EXIT");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    t1.start();
                    t1.join();
                    break;
                case 2:
                    t2.start();
                    t2.join();
                    break;
                case 3:
                    t3.start();
                    t3.join();
                    break;
                case 4:
                    t4.start();
                    t4.join();
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("PLEASE SELECT FROM ABOVE OPTIONS");
                    break;
            }
        }
    }
}
/*
WELCOME TO STUDENT MANAGEMENT SYSTEM
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
1
PLEASE ADD BELOW DATA
Roll NO
NAME
DIVISION
AGE
ADDRESS
1
mukesh
A
21
delhi
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
2
Student{roll_no=1, age=21, name='mukesh', division='A', address='delhi'}
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
1
PLEASE ADD BELOW DATA
Roll NO
NAME
DIVISION
AGE
ADDRESS
2
sashikant
D
32
pune
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
1
PLEASE ADD BELOW DATA
Roll NO
NAME
DIVISION
AGE
ADDRESS
3
aniket
A
21
pune
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
1
PLEASE ADD BELOW DATA
Roll NO
NAME
DIVISION
AGE
ADDRESS
1
Ani
A
32
pune
DuplicateStudentException
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
2
Student{roll_no=1, age=21, name='mukesh', division='A', address='delhi'}
Student{roll_no=2, age=32, name='sashikant', division='D', address='pune'}
Student{roll_no=3, age=21, name='aniket', division='A', address='pune'}
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
3
ENTER YOUR STUDENT ID
21
ENTER YOUR ROLL NUMBER
5
StudentNotExistException
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
3
ENTER YOUR STUDENT ID
23
ENTER YOUR ROLL NUMBER
1
ENTER TOUR MARKS FOR MATHS-PHYSICS-CHEMISTRY-ENGLISH-HINDI
45
67
78
90
29
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
3
ENTER YOUR STUDENT ID
24
ENTER YOUR ROLL NUMBER
2
ENTER TOUR MARKS FOR MATHS-PHYSICS-CHEMISTRY-ENGLISH-HINDI
35
35
35
35
35
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
3
ENTER YOUR STUDENT ID
3
ENTER YOUR ROLL NUMBER
3
ENTER TOUR MARKS FOR MATHS-PHYSICS-CHEMISTRY-ENGLISH-HINDI
23
23
23
23
23
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
4
ENTER THE ROLL NUMBER FOR WHICH YOU WANT MARKSHEET
1
Student{roll_no=1, age=21, name='mukesh', division='A', address='delhi', marks=[45, 67, 78, 90, 34]}
your are FAIL in 1 Exam
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
4
ENTER THE ROLL NUMBER FOR WHICH YOU WANT MARKSHEET
2
Student{roll_no=2, age=32, name='sashikant', division='D', address='pune', marks=[35, 35, 35, 35, 35]}
your are pass in all the subject
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT
4
ENTER THE ROLL NUMBER FOR WHICH YOU WANT MARKSHEET
3
Student{roll_no=3, age=21, name='aniket', division='A', address='pune', marks=[23, 23, 23, 23, 23]}
your are FAIL in 5 Exam
PRESS 1 FOR ADD STUDENT
PRESS 2 FOR DISPLAY STUDENT
PRESS 3 FOR ADD STUDENT MARKS
PRESS 4 FOR DISPLAY STUDENT MARKSHEET
PRESS 0 FOR EXIT

 */