import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staff2Method {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Staff [] arr = new Staff[4];
        for(int i =0; i< arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            float d = sc.nextFloat(); sc.nextLine();
            double e = sc.nextDouble(); sc.nextLine();
            
            arr[i] = new Staff(a, b, c, d, e);
        }
        
        String dName = sc.nextLine();
        double res = findAvg(arr, dName);
        if(res >= 0){
            System.out.println(res);
        }
        else{
            System.out.println("Department doesn't exist");
        }
        Staff obj = findMin(arr);
        if(obj == null){
            System.out.println("No such staff with years of experience greater than 5 available");
        }
        else{
        System.out.println(obj.getId());
        System.out.println(obj.getSname());
        }
    }
    
    public static double findAvg(Staff[] arr, String dName){
        int count =0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getDname().equalsIgnoreCase(dName)){
                sum += arr[i].getCSal();
                count++;
            }
        }
        return sum/count;
    }
    
    public static Staff findMin(Staff[] arr){
        Staff s =  null;
        double max = Double.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
        //     if(arr[i].getCSal()< max)
        //     //if(arr[i].getYexp() >5 && arr[i].getCSal()< max)
        // //    if(arr[i].getCSal()< max)
        if(arr[i].getYexp()> 5){
            if(arr[i].getCSal()< max){
                max = arr[i].getCSal();
                s = arr[i];
            }
        }
        {
            
            } 
        }
        return s;
        
        
    }
}

class Staff{
    private int sId;
    private String sName;
    private String dName;
    private float yExp;
    private double cSal;
    
    public Staff(int sId,  String sName, String dName, float yExp, double cSal){
        this.sId = sId;
        this.sName = sName;
        this.dName = dName;
        this.yExp = yExp;
        this.cSal = cSal;
    }
    public int getId(){
        return sId;
    }
    public String getSname(){
        return sName;
    }
    public String getDname(){
        return dName;
    }
    public float getYexp(){
        return yExp;
    }
    public double getCSal(){
        return cSal;
    }
}

/*
Staff Class: Defines a class Staff with attributes such as ID, name, department name, years of experience, and current salary. It also includes getter methods to retrieve these attributes.
Solution Class: This is the main class that contains the main method to execute the program. Here's what it does:
Reads input from the standard input (console) for staff data.
Creates an array of Staff objects.
Calculates the average current salary for a given department (findAvg method).
Finds the staff member with the minimum current salary and more than 5 years of experience (findMin method).
findAvg Method: Calculates the average current salary for a given department by iterating through the array of Staff objects and summing up the salaries of staff belonging to the specified department.
findMin Method: Finds the staff member with the minimum current salary among those with more than 5 years of experience. It iterates through the array of Staff objects and keeps track of the minimum salary and the corresponding staff member.
*/
