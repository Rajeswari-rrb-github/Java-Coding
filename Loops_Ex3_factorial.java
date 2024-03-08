import java.util.*;

public class Loops_Ex3_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int factorial = 1;

        if(n == 0) {
            System.out.println("Factorial of 0 is 1");
        } 
        else if(n > 0) {
            for(int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        } 
        
        else {
            System.out.println("Invalid input: Factorial of a negative number does not exist.");
        }
    }
}
