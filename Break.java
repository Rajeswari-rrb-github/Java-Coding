// keep entering numbers untill user enters a multiple of 10
import java.util.*;
public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println(num + " is a multiple of 10!");
                break; // terminate the loop when num is a multiple of 10
            } else {
                System.out.println(num + " is not a multiple of 10. Try again!");
            }
        }

        sc.close();
    }
}
