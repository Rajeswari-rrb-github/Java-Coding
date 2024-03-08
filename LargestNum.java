import java.util.*;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        if (a>b){
            System.out.println("Largest number among two input " + a);
        }
        else{
            System.out.println("Largest number among two input " + b);
        }
    }
}
