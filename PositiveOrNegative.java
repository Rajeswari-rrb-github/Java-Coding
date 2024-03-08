import java.util.*;

public class PositiveOrNegative {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num= sc.nextInt();
       sc.close();
       // ternary operator to check whether a number is positive or negative
       String answer =(num > 0)? "positive":"negative";
       System.out.println(answer);
    }
}
