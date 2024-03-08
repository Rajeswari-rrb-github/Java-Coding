// enter your age and know the comments
import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age here : ");
        int age= sc.nextInt();
        if(age>60){
            System.out.println("old age group");
        }
        else if (age> 40){
            System.out.println("you're in your late forties");
        }
        else if (age> 30){
            System.out.println("you're in your late thirties");
        }
        else if (age> 20){
            System.out.println("you're not a teenager any more");
        }
        else if (age> 13){
            System.out.println("you're in your teenages");
        }
        else{
            System.out.println("your age is : "+age+ " years");
        }
        sc.close();
    }
}
