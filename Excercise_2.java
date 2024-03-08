import java.util.Scanner;

public class Excercise_2 {
    public static void main(String[] args) {
       // question 1
       float a = 7/4.f *9/2.f;
       System.out.println(a);

       // question 2
       char grade = 'A';
       // Encrypt the grade
       grade=(char)(grade+8); // ----------------> Type casting
       System.out.println(grade);

       // decrypt the grade now
       grade=(char)(grade-8); // ----------------> Type casting
       System.out.println(grade);
       
       // question 3
       Scanner sc= new Scanner(System.in);
       int p =5;
       System.out.print("enter the value of b : ");
       int b= sc.nextInt();
       if (p>b){
        System.out.println("p greater than b");
       }
       else if (p==b) {
        System.out.println("They are equal");
       }
       else{
        System.out.println("Nope, b greater than p");
       }

       // question 4
       System.out.print("enter the value of v : ");
       float v= sc.nextFloat();
       System.out.print("enter the value of u : ");
       float u= sc.nextFloat();
       System.out.print("enter the value of f : ");
       float f= sc.nextFloat();
       System.out.print("enter the value of s : ");
       float s= sc.nextFloat();
       float y= (v*v-u*u)/(2*f*s);
       System.out.println(y);

       //question 5
       int x= 7;
       System.out.println(++x*x++);
       int d= 7*49/7+35/7;
       System.out.println(d);
       System.out.println(x);
       sc.close();
    }
}
