public class TypePromotion3 {
    public static void main(String[] args){
        int a = 10;
        float b= 20.25f;
        long c= 25;
        double d= 30;
        double ans = a+b+c+d; // here all values are converted into double
        System.out.println(ans);
    }
}
