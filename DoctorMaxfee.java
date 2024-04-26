import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DoctorMaxfee {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Doctor [] arr = new Doctor[n];
        
        for (int i = 0; i < arr.length; i++) {
            int doctorId = sc.nextInt(); sc.nextLine();
            String type= sc.nextLine(); 
            int deptNo= sc.nextInt(); sc.nextLine();
            double fee= sc.nextDouble();
            arr[i]= new Doctor(doctorId, type, deptNo, fee);
        }
        //funcion call through the array object
        Doctor obj = getDoctorwithMaxFee(arr); 
        if(obj != null){
            System.out.println(obj.getDoctorId());
            System.out.println(obj.getType());
            System.out.println(obj.getDeptNo());
            System.out.println(obj.getFee());
        }
    }

public static Doctor getDoctorwithMaxFee(Doctor [] arr){
    Doctor result= null;
    double min = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i].getFee()> min){
            min= arr[i].getFee();
            result= arr[i];
        }
    } 
    return result;
}
}

// class-- doctor
class Doctor{
     int doctorId;
     String type;
int deptNo;
 double fee;
    
    // constructor
    public Doctor(int doctorId, String type, int deptNo, double fee){
        this.doctorId= doctorId;
        this.type= type;
        this.deptNo= deptNo;
        this.fee= fee;
    }
    // getter
    public int getDoctorId(){
        return doctorId;
    }
    public String getType(){
        return type;
    }
    public int getDeptNo(){
        return deptNo;
    }
    public double getFee(){
        return fee;
    }
}
