import java.util.Scanner;
public class Ex_4_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of the day of the week : ");
        int day_num= sc.nextInt();
        switch (day_num) {
            case 1:
                System.out.println("Monday"); 
                break;
            case 2:
                System.out.println("Tuesday"); 
                break;
            case 3:
                System.out.println("Wednesday"); 
                break;
            case 4:
                System.out.println("Thursday"); 
                break;
            case 5:
                System.out.println("Friday"); 
                break;
            case 6:
                System.out.println("Saturday"); 
                break;
            case 7:
                System.out.println("Sunday"); 
                break;
            default:
                System.out.println("Enter a valid number! >_<");
                break;
        }
    sc.close();
    }
}
