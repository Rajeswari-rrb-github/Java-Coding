import java.util.Scanner;
public class Half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        for(int line =1; line<=n; line++){
            // numbers to print
            for(int number =1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
