import java.util.Scanner;

public class SpaceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        int spaceCount = 0; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        if (spaceCount >= 3) {
            System.out.println("Number of spaces: " + spaceCount);
        } else {
            System.out.println("NA");
        }
    }
}
