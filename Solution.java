import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Customer [] arr = new Customer[n];
        
        for (int i = 0; i < arr.length; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String address = sc.nextLine();
            double total_purchase = sc.nextDouble(); sc.nextLine();
            arr[i] = new Customer(id, name, address, total_purchase);
        }
        String name= sc.nextLine();
        // function call through array object
        Customer obj = searchCustomerByName(arr, name); 

        if(obj!= null){
            System.out.println("id-"+obj.getId());
            System.out.println("name-"+obj.getName());
            System.out.println("address-"+obj.getAddress());
            System.out.println("total_purchase-"+obj.getTotal_purchase());
        }
        else{
            System.out.println("No Customer Found");
        }
    }
    
    public static Customer searchCustomerByName(Customer[] arr, String name){
        // Implement searchCustomerByName Method
        Customer obj = null;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getName().equalsIgnoreCase(name)){
                obj= arr[i];
            }
            
        }
        return obj;
    }
}
// customer class
class Customer {
    int id;
    String name;
    String address;
    double total_purchase;
    
    // constructor
    public Customer(int id, String name, String address, double total_purchase){
        this.id= id;
        this.name= name;
        this.address= address;
        this.total_purchase= total_purchase;
    }
    // getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getTotal_purchase(){
        return total_purchase;
    }
}
