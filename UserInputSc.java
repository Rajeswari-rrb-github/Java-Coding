import java.util.Scanner;

public class UserInputSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // boolean b1= sc.hasNextInt(); // to check validity of user given value
        // System.out.println(b1);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of the two given numbers is : "+sum);
        sc.close();
        

    }
}
