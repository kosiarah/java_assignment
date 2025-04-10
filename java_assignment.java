package javaassignment;

import java.util.Scanner;

public class JavaAssignment
{
    public static void main(String[] args)
    {
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int gradeInt = grade.nextInt();

       Scanner name = new Scanner(System.in);
       System.out.print("Enter your name: ");
       String nameString = name.nextLine();

       while (true)
       {
           if (gradeInt > 0 && gradeInt < 50)
           {
               System.out.println("Sorry " + nameString + ", you failed");
           }
           else if (gradeInt >= 50 && gradeInt < 60)
           {
               System.out.println("Hello " + nameString + ", you got a D-");
           }
           else if (gradeInt >= 60 && gradeInt < 70)
           {
               System.out.println("Hello " + nameString + ", you got a D");
           }
           else if (gradeInt >= 70 && gradeInt < 80)
           {
               System.out.println("Hello " + nameString + ", you got a C");
           }
           else if (gradeInt >= 80 && gradeInt < 90)
           {
               System.out.println("Hello " + nameString + ", you got a B");
           }
           else if (gradeInt >= 90 && gradeInt <= 100)
           {
               System.out.println("Hello " + nameString + ", you got an A");
           }
           break;
       }
    }
}
