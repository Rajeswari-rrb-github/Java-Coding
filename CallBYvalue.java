public class CallBYvalue {
    public static int calculateSum(int a, int b){
        int sum= a+b;
        return sum;
    }

    public static void swap(int a, int b){
    // code for swap
    int temp =a;
    a=b;
    b=temp;

    System.out.println("a is "+ a);
    System.out.println("b is "+ b);
    }
   public static void main(String[] args) {
    // swap = values exchanging
    int a=10;
    int b= 15;
    swap(a,b);
    }
}
