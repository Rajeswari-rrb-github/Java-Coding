import java.util.*;

public class ProductInput {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     sc.close();
     int product = a*b;
     System.out.println(product);   
    }
}
