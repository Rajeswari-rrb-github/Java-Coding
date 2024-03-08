import java.util.Scanner;
public class EX_3_3rd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = sc.nextLine();
        System.out.printf("Dear %s, Thanks a lot!!!", name);
        System.out.println();
        sc.close();


        
// method two

        String letter = "Dear <|name|>, Thanks a lot!!!!!!";
        letter = letter.replace("<|name|>","Harry");
        System.out.println(letter);

    }
}
    