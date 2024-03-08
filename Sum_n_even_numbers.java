import java.util.Scanner;
public class Sum_n_even_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0; // sum of even numbers
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i%2==0) {
                sum+=i;
            }
            i++;
        }
        System.out.println("sum of n even numbers : " +sum);
        sc.close();
    }
}
