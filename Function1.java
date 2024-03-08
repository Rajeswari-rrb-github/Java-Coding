import java.util.*;

public class Function1 {
    public static int printHelloWorld(){
        System.out.println("Hello World");
        return 1;
    }
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum= a+b;
        System.out.println(sum);
    }
   public static void main(String[] args) {
        printHelloWorld(); // function call
        calculateSum();
    }
}
