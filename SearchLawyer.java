import java.io.*;
import java.util.*;

// solution class
public class SearchLawyer {
    public static void main(String args[] ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Lawyer [] arr = new Lawyer[n];
        for (int i = 0; i < arr.length; i++) {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            double fees = sc.nextDouble(); sc.nextLine();
            int age = sc.nextInt();sc.nextLine();
            
            arr[i] = new Lawyer(id, name, fees, age);
        }
        String name = sc.nextLine();
        Lawyer res = searchLawyerByName(arr, name);
        
        if (res == null){
            System.out.println("No Lawyer found with mentioned attribute.");
        }else{
            
            System.out.println("id-"+res.getId());
            System.out.println("name-"+res.getName());
            System.out.println("fees-"+res.getFees());
            System.out.println("age-"+res.getAge());
        }
    }
    // method
    public static Lawyer searchLawyerByName(Lawyer[] arr, String sname){
        Lawyer obj = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equalsIgnoreCase(sname)) {
                obj = arr[i];
            }
        } 
        return obj; 
    }
}



// lawyer class
class Lawyer{
    //write the code
    private int id;
    private String name;
    private double fees;
    private int age;
    
    // constructor
    public Lawyer(int id, String name, double fees, int age){
        this.id = id;
        this.name = name;
        this.fees= fees;
        this.age= age;
    }
    // getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getFees(){
        return fees;
    }
    public int getAge(){
        return age;
    }
}