import java.util.*;
public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day_num =sc.nextInt();
        sc.close();

        switch(day_num){
            case 1:
            System.out.println("This is Monday");
            break;
            case 2:
            System.out.println("This is Tuesday");
            break;
            case 3:
            System.out.println("This is Wednesday");
            break;
            case 4:
            System.out.println("This is Thursday");
            break;
            case 5:
            System.out.println("This is Friday");
            break;
            case 6:
            System.out.println("This is Saturday");
            break;
            case 7:
            System.out.println("This is Sunday");
            break;
            default:
            System.out.println("Invalid input! Please enter week number between 1 to 7");
        }
    }
}
