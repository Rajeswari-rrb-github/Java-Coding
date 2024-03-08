import java.util.*;
public class ProductofTwoNUm_Using_func {
    public static int prod(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int multiply=prod(a, b);
        sc.close();
        System.out.println("chalo product hain "+multiply);

    }
}
