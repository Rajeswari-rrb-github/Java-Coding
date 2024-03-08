/*Question 2: Write a program that reads a set of integers,
and then prints the sum of the even and odd integers*/

public class Loops_Ex_2 {
    public static void main(String[] args) {
        int odd_sum= 0;
        int even_sum =0;
        for(int i=1; i<=100;i++){
            if(i%2==0){
                even_sum+=i;
            }
            else{
                odd_sum+=i;
            }
    }
    System.out.println("Sum of even numbers: "+even_sum);
    System.out.println("Sum of odd numbers: "+odd_sum);
    }
}
