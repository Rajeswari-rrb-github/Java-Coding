// VariableDataProb3
/* Question3:
Enter cost of 3 items from the user
(using float data type)-a pencil,a pen and an eraser.
You have to output the total cost of the items 
back to the user as their bill.(Add on : 
You can also try adding 18% gst tax to 
the items in the bill as an advanced problem) */

import java.util.*;
public class VariableDataProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float item1= sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();
        double discount= 1.18;
        double total_cost= (item1+item2+item3)* discount;
        sc.close();
        System.out.println(total_cost);
    }
}
