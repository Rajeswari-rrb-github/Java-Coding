public class Fever_check{
    public static void main(String[] args) {
        double temp = 103.5;
        // ternary operator

        String fever= (temp>100)?"You've fever": "You don't have fever";
        System.out.println(fever);
        
    }
}
