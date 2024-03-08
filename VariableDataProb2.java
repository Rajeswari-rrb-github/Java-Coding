import java.util.Scanner;

/*Question2:In aprogram, input the side of a square.
You have to output the area of the  square.
(Hint : area of a square is (side x side)) */

public class VariableDataProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a= sc.nextFloat();
        float area = a*a;
        sc.close();
        System.out.println(area);
    }
}
