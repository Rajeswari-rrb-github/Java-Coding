import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        sc.close();
        // ternary operator
        String type =(number1%2==0) ? "even" : "odd"; 
        System.err.println(type);
    }
}
