import java.util.Scanner;
public class EX_4_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your income! : ");
        float income= sc.nextFloat();
        float tax;
        if (income<250000) {
            tax=0;
            System.out.println(tax);
        }
        else if (income>250000 && income< 500000) {
            tax= income*0.05f;
            System.out.println("The amount of tax you need to pay : "+tax);   
        } 
        else if (income>500000 && income< 1000000) {
            tax= income*0.2f;
            System.out.println("The amount of tax you need to pay : "+tax);
        }

        else {
            tax= income*0.3f;
            System.out.println("The amount of tax you need to pay : "+tax); 
        }
        sc.close();
    }
}
