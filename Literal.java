public class Literal {
    public static void main(String[] args) {
        byte age = 34; // 34 is literal
        int int1= 5;
        char ch= 'A';
        float f1= 5.66f; // if I've written only 5.66 it would be considered double by default, so we  write 5.66f to mark it as floating point number
        double d1= 4.66;
        double d2 = 5.5d;
        double d3 = 3.7D;
        long ageDino  = 646515546972l;
        boolean b1= true;
        String str = "Raj";
        System.out.println(age+ int1 +ch + f1+ d1+d2+d3+ageDino);
        System.out.println(str);
        System.out.println(b1);
    }
}
// literal is the constant value that can be assigned to a variable
// for byte, short or int data type we don't need to add any suffix after number 
//like we did for float and double. but for long numbers we have to put the prefix "l" after the large number
//or by default it will take it as an integer