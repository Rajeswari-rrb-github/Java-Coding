import java.util.*;
public class SumOf1stNaturalnums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum= 0;
    int i =1;
    sc.close();
    while(i<=n){
        sum+=i;
        i++;
    }
    System.out.println(sum);
  }  
}
