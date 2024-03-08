import java.util.Scanner;
public class IntegerOr_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b1= sc.hasNextInt(); // to check validity of user given value
        System.out.println(b1);
        System.out.println();
        sc.close();
    }
}
