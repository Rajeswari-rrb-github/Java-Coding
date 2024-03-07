        //no. of turns to be made= n-1, n= no of elemnts present in the array
        // each time the arrary element is getting compared with its adjacent element, 0- based indexing is followed , so checking stuffs starts from most left side elemnent, 
        //and in each case swapping is taking placed
        // therefore outer loop will run for n=0 to n-2,as total no. of iterations should be n-1
        // for(turns= 0 to n-2)----- outer loop
        // for(int j= 0 to (n-2-turns))
        // for n=5, turns=0, inner loop will run upto(5-2-0)= 3 times
        // in similar way, in turn =1, j=0 to (5-2-1)= 2

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int turn = 0; turn < arr.length-1; turn++) {
            for(int j=0; j< arr.length-1-turn; j++){
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }

    }

    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {5,8,7,3,1,9};
        bubbleSort(arr);
        printArr(arr);
    }
}
