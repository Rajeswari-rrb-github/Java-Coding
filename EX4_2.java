/* Write a program using Java to find out whether a student is pass or fail. 
If it requires total 40% and 33% in each subject to pass. Assume 3 subjects to pass and take marks as input*/

import java.util.Scanner;
public class EX4_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the marks obtained in subject one");
        int marks1= sc.nextInt();

        System.out.println("Enter the marks obtained in subject two");
        int marks2= sc.nextInt();

        System.out.println("Enter the marks obtained in subject three");
        int marks3= sc.nextInt();

        float percentage_marks= ((marks1+marks2+marks3)/3.0f);

        if (percentage_marks >= 40 && marks1 >=33 && marks2 >=33 && marks3 >=33) {
            System.out.println("your'e passed!");
        } 
        else {
            System.out.println("you're failed!");
        }
        sc.close();
    }
}
