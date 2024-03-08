import java.util.Scanner;
public class Factorial_while {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int f=1;
        int i =1;
        while(i<=n){
            f*=i;
            i++;
        }
        System.out.println("value of factorial of the given number : "+ f);
        sc.close();
    }
}
