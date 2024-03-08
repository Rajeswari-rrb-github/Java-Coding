import java.util.Scanner;
public class KMtomiles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value in kilometers to be converted in to miles : ");
    int valueInkm = sc.nextInt();
    double valueInmiles= valueInkm * 0.621;
    System.out.println("the value in miles is : "+ valueInmiles);
    sc.close();
  }  
}
