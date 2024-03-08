import java.util.*;
public class Ternary_Pass_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();
        // ternary operator
        String status =(marks>=33) ? "pass" : "fail"; 
        System.out.println(status);
    }
}

