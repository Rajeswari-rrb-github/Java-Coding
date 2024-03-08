import java.util.*;

public class Prime2ndWay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        boolean isPrime =true; 
        if (n==2){
            System.out.println("n is prime");
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){ // n is a multiple of i (i is not equal to 1 or n)
                    isPrime= false;
                }
            }
    
            if (isPrime== true) {
                System.out.println(n+" is prime");
            }
            else{
                System.out.println(n+" is not prime");
            }
        }
    }
}

