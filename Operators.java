public class Operators {
    public static void main(String[] args) {
        // Arithmatic operator
        int a= 5;
        int b= 4*a;
        int c= 16%a;
        System.out.println(b);
        System.out.println(c);
        b*=9;
        System.out.println(b);
        System.out.println(4.09%0.8); // Arithmatic operations works on floats and doubles as well
        // precedence & associativity-- refer to the table
        System.out.println(56*96-555+66*241/2);
        // Comparison operator
        System.out.println(a==20);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a!=b);
        // logical operator
        System.out.println(64> 9 && 45<90); // AND operation
       // System.out.println(64> 9|| 1<4); //OR Operation
        // bitwise operator
        System.out.println(2&3);
        // 10
        // 11
        // -----------
        // 10 ------------> bitwise AND

        // increment and decrement operator
        int p = 9;
        System.out.println(p++); // print or used then increment its value
        p+=3;
        System.out.println(++p); // incremented and then print
        System.out.println(p--); //print or used then decrement its value
        System.out.println(--p); //decremented and then print or used

        // Quick quiz

        int y= 7;
        int x= ++y*8;
        System.out.println(x);

        char ch1= 'X';
        ch1++;
        System.out.println(ch1);
        char ch2 = 'A';
        System.out.println(++ch2);

    }
}
