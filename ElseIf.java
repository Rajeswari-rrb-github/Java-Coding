import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if (age>= 18){
            System.out.println("You're Adult");
        }
        else if (age< 18 && age>=13){
            System.out.println("You're a teenager");
        }
        else{

            System.out.println("You're not adult");
        }
        System.out.println();
    }
}
