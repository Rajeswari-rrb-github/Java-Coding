public class MAX_Subarray_sum {
    public static void max_Subarray_sum(int numbers[]) {
        int current_sum=0;
        int maxSum= Integer.MIN_VALUE;
    
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    //  subarray sum
                    current_sum+= numbers[k];                  
                }
                System.out.println(current_sum);
                if (maxSum < current_sum){
                    maxSum = current_sum;
                }
            }
        }
        System.out.println("Maximum sum = "+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        max_Subarray_sum(numbers);
    }
}
