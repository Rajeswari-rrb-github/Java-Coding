import java.util.*;

public class FuncEX3 {
    public static int palindrome(int n){
        int rev=0;
        int originalNum = n; // store the original number
        while(n>0){
            int last_digit=n%10;
            rev= (rev*10) + last_digit;
            n/=10;
        }
        if(originalNum == rev){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        palindrome(n);
    }
}
