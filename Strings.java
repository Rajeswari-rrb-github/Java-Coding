import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String str = new String("Raj");
        String name = "Rajrajeswari";
        System.out.println(str);
        System.out.println(name);
        int a= 5;
        int b= 6;
        System.out.printf("the value of a is %d and value of b is %d", a,b); // %d is format specifier
        Scanner sc= new Scanner(System.in);
       // String str1= sc.next();
        String str2= sc.nextLine();
        //System.out.println(str1);
        System.out.println(str2);
        sc.close();
    }
}
