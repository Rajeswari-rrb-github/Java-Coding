import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        sc.close();
        int tax;
        
        if (income< 500000){
            tax =0;
            System.out.println("tax is "+ tax);
            System.out.println(income-tax);
        }

        else if (income> 500000 && income< 1000000){
            tax = (int)(income *0.2);
            System.out.println("tax is "+ tax);
            System.out.println(income-tax);
        }

        else {
            tax = (int)(income *0.3);
            System.out.println("tax is "+ tax);
            System.out.println(income-tax);
        }
    }
}
