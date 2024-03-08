/* Write a program in java to claculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the user(Marks are out of 100) */

import java.util.Scanner;
public class Excercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first marks here : ");
        int marks1= sc.nextInt();
        System.out.println("enter the 2nd marks here : ");
        int marks2= sc.nextInt();
        System.out.println("enter the 3rd marks here : ");
        int marks3= sc.nextInt();
        System.out.println("enter the 4th marks here : ");
        int marks4= sc.nextInt();
        System.out.println("enter the 5th marks here : ");
        int marks5= sc.nextInt();
        int sum = marks1+ marks2+ marks3+ marks4+ marks5;
        System.out.println(sum);
        int percentage= (sum/5);
        System.out.println("The percentage obtained by the student is : " + percentage);
        System.out.println(percentage);
        sc.close();


    }
}
