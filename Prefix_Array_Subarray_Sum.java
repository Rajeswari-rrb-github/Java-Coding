public class Prefix_Array_Subarray_Sum {
    public static void max_Subarray_sum(int numbers[]) {
        int current_sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        // Calculate prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                // Calculate subarray sum
                current_sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < current_sum) {
                    maxSum = current_sum;
                }
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        max_Subarray_sum(numbers);
    }
}
