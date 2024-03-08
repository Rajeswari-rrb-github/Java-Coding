public class MIN_Max_Subarray_sum {
    public static void calculateSubarraySums(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        calculateSubarraySums(numbers);
    }
}
