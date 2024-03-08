import java.util.Scanner;
public class EX_4_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the website : ");
        String extention= sc.next();

        if (extention.endsWith(".org")) {
            System.out.println("Organization website");
        } 
        else if (extention.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (extention.endsWith(".in")){
            System.out.println("Indian website");
        }
        sc.close();
    }
}
