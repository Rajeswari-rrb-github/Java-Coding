// arrays work in passing by reference

import java.util.*;
public class ArrayInFunc {
    public static void update(int marks[]){
        for(int i= 0; i<marks.length; i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        int marks[]= {90, 98, 97};
        update(marks);
        // print out the marks
        for(int i= 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        Scanner sc= new Scanner(System.in);
        sc.close();
        
        
    }
}
