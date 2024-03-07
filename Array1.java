import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int marks[]= new int[100];
        //int numbers[]= {1,2,3}; // size = 3
        //String fruits[]= {"apple", "banana"};

        Scanner sc= new Scanner(System.in);
        marks[0]= sc.nextInt(); //phy
        marks[1]= sc.nextInt(); // chem
        marks[2]= sc.nextInt(); // math
        sc.close();
        System.out.println("physics = "+ marks[0]);
        System.out.println("chemistry = "+ marks[1]);
        System.out.println("math = "+ marks[2]);
        int percentage =(marks[0]+ marks[1]+ marks[2])/3;
        System.out.println("percetage = " + percentage +"%");
        System.out.println("length of array = " + marks.length);
    }
}
