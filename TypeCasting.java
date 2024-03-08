import java.util.*;

public class TypeCasting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float float_var = sc.nextFloat();
        sc.close();
        int int_var= (int) float_var;
        System.out.println(int_var);
/*converting characters to numbers 
here a is equivalent to 97 and b is 98 
which is just next to a's number means there's a series*/
        char ch= 'a';
        int num= ch;
        System.out.println(num);
        char ch1= 'b';
        int num1= ch1;
        System.out.println(num1);
        char ch2= 'A';
        int num2= ch2;
        System.out.println(num2);
        char ch3= 'B';
        int num3= ch3;
        System.out.println(num3);
    }
}
