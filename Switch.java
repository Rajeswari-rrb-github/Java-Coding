import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age here : ");
        int age= sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("your'e going to become an adult");
                break;
            case 23:
                System.out.println("your'e going to join a job!!");
                break;
            case 60:
                System.out.println("your'e going to retire! :)");
                break;
            default:
                System.out.println("enjoy your life!");
                break;
        }
        System.out.println("switch cases are over bro!");
        sc.close();
    }
}