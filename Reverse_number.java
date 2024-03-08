import java.util.*;
public class Reverse_number {
    public static void main(String[] args, int i) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        while(n>0)
        {
            int last_digit= n%10;
            System.out.print(last_digit);
            n/=10  ;
        }
    }
}
