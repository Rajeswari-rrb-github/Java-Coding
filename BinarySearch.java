public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start=0, end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2; // calculate middle index
             
            if(numbers[mid]== key){ // if the key is found at middle index
                return mid;
            }
            if(numbers[mid]< key){ // if key is greater, ignore left half
                start= mid+1;
            }
            else{ // if key is smaller, ignore right half
                end= mid-1;
            } 
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
       int numbers[]= {2,4,6,8,10,12,14}; // array of sorted numbers
       int key= 10; // key to be searched

       System.out.println("Index of the key is : "+ binarySearch(numbers, key)); // print the index of the key
    }
}
