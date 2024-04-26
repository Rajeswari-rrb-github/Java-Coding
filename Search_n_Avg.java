import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Search_n_Avg {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Customer [] arr = new Customer [n];
        for (int i = 0; i < n ; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble(); 
            int d = sc.nextInt();
            
            arr[i] = new Customer(a, b, c, d);
            
        }
        
        double s = sc.nextDouble();
        
        double res = findAvg(arr);
        if(res>0){
            System.out.println("Average of salary "+res);
            
        }
        
        Customer res2 = search(arr, s);
        if(res2 == null){
            System.out.println("No Customer found with mentioned attribute");
        }
        else{
            System.out.println("id-"+res2.getId());
            System.out.println("name-"+res2.getName());
            System.out.println("salary-"+res2.getSl());
            System.out.println("age-"+res2.getAge());
        }
        
        
    }
    
    //method 1
    public static double findAvg(Customer [] arr){
        double sum =0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+ arr[i].getSl();
            n++;
        }
        return sum/n;
    }
    
    
    // method 2
    public static Customer search(Customer [] arr, double s){
        Customer a = null;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getSl() == s){
                a = arr[i];
            }
        }
        return a;
    }
}

class Customer{
    private int id;
    private String name;
    private double sl;
    private int age;
    
    // constructor
    
    public Customer(int id, String name, double sl, int age){
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.age = age;
    }
    
    // getters & setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public double getSl(){
        return sl;
    }
    public void setSl(double sl){
        this.sl = sl;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
