/* Question1:
In aprogram,input 3 numbers:A,B and C.
You have to output theaverage of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers 
divided by N) */
import java.util.*;
public class VariableDataProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        sc.close();
        float d= (a+b+c)/3;
        System.out.println(d);
    }
}
