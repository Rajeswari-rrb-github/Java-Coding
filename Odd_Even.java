import java.util.*;
public class Odd_Even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        sc.close();
        if (a%2==0){
            System.out.println("The no. is even");
        }
        else{
            System.out.println("The no. is odd");
        }
    }
}
