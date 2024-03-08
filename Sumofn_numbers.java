// Write a program to sum first n even numbers using while loop
public class Sumofn_numbers {
public static void main(String[] args) {
    int sum=0;
    int n = 4;
    for (int i = 0; i < n; i++) {
        sum=sum+2*i;
    }
    System.out.println("sum of n even numbers : " +sum);
}
}
