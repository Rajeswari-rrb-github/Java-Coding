public class Linear_Search_STR{
    public static int linearSearch(String[] arr, String target) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Compare the current element with the target
            if (arr[i].equals(target)) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "Dave", "Eve" };
        String target = "Charlie";

        int index = linearSearch(names, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
