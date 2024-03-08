import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int sum= a+b+c;
        System.out.println("The sum of entered three numbers is : "+sum);
        sc.close();
    }
}
