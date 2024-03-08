import java.util.Scanner;
public class SumMultiplicationTable {
    public static void main(String[] args) {
        System.out.print("enter the number you need the sum of table of : ");
        Scanner sc= new Scanner(System.in);
        int sum= 0;
        int n= sc.nextInt();
        for (int i = 1; i < 11; i++) {
            sum += n*i;
        }
        System.out.println(sum);
        sc.close();
    }
}
