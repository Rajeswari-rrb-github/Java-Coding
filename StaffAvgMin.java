import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaffAvgMin {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Grain arr [] = new Grain[n];
        for (int i = 0; i < arr.length; i++) {
            int gId = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String state = sc.nextLine();
            int qtyInQ = sc.nextInt(); sc.nextLine();
            arr[i] = new Grain(gId, name, state, qtyInQ);
        }
        
        String name = sc.nextLine();
        // calling method 1
        int result = findGMax(arr);
        if(result > 1){
            System.out.println(result);
        }
        else{
            System.out.println("Max Quantity not Found");
        }
        
        // calling method 2
        
        Grain a = searchN(arr, name);
        if (a== null) {
            System.out.println("No Grains with matching names are found");
        } else {
            System.out.println(a.getId());
            System.out.println(a.getName());
            System.out.println(a.getState());
            System.out.println(a.getQtyInQ());
            
        }
        
        
        
        
    }
    //method 1
    public static int findGMax(Grain [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getQtyInQ()> max) {
                max= arr[i].getQtyInQ();
            }
            
        }
        return max;
        
    }
    
    //method 2
    public static Grain searchN(Grain [] arr, String name){
        Grain ar = null;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getName().equalsIgnoreCase(name)){
                ar= arr[i];
            }
        } return ar;
    }
}



class Grain{
    private int gId;
    private String name;
    private String state;
    private int qtyInQ;
    
    public Grain(int gId, String name, String state, int qtyInQ){
        this.gId = gId;
        this.name = name;
        this.state = state;
        this.qtyInQ = qtyInQ;
    }
    //getters
    public int getId(){
        return gId;
    }
    public String getName(){
        return name;
    }
    public String getState(){
        return state;
    }
    public int getQtyInQ(){
        return qtyInQ;
    }
    
    
}
