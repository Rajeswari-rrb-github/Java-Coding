import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        System.out.print("Hello!! "+ str1+", have a good day dear!!");
        System.out.println();
        sc.close();
    }
}
