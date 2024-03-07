public class BinomialCoefficient {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    
    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int nmr_fact = factorial(n - r);
        int binomialCoefficient = fact_n / (fact_r * nmr_fact);
        return binomialCoefficient;
    }
    
    public static void main(String[] args) {
        int n = 25;
        int r = 20;
        int result = binCoeff(n, r);
        System.out.println("The binomial coefficient for n = " + n + " and r = " + r + " is " + result);
    }
}
