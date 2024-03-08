// import java.util.*;
public class LargestNumArray {
    public static int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE; // - infinity
        int smallest= Integer.MAX_VALUE; // + infinity
        for(int i=0; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest= numbers[i];
            }
            if(smallest> numbers[i]){
                smallest= numbers[i];
            }
        }
        System.out.println("smallest Value is = "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8};
        System.out.println("Largest value is = "+ getLargest(numbers));
    }
}
