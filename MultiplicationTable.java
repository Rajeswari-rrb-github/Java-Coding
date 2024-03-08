import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("enter the number you need table of : ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d\n", n,i,n*i);

            
        }
        sc.close();
    }
}
