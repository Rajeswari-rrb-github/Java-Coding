import java.util.*;

public class Factorial_Function {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        if (n == 0) {
            System.out.println("Factorial of 0 is 1");
        } else if (n > 0) {
            int result = factorial(n);
            System.out.println("Factorial of " + n + " is " + result);
        } else {
            System.out.println("Invalid input: Factorial of a negative number does not exist.");
        }
    }
}
