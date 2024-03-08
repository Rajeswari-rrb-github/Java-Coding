public class Patterns_function {

//     output of the following code is as follows
//     **********
//     *        *
//     *        *
//     *        *
//     *        *
//     *        *
//     *        *
//     *        *
//     **********
// code

    public static void hollow_Rect(int total_rows, int total_columns){
        // outer loop- no. of lines
        for(int i=1; i<=total_rows; i++){
            // inner loop- to traverse through columns
            for(int j=1; j<=total_columns; j++){
                // cell= (i,j)
                if(i==1 || i==total_rows || j==1 || j==total_columns){
                    // boundary cell
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//  output of the following code is as following
//      *
//     **
//    ***
//   ****
// code

    public static void inverted_halfrotated_pyramid(int totalRows){
        // outer loop= no. of lines
        for(int i=1; i<= totalRows; i++){
            //spaces to be printed
            for(int j=1; j<= totalRows-i; j++){
                System.out.print(" ");
            }
            // stars to be printed
            for(int j=1; j<= i;j++){
                System.out.print("*");
        }
        System.out.println();
    }
}
//output
// 12345
// 1234
// 123
// 12
// 1

// code 
public static void inverted_half_pyramid_numbers(int n){
    // outer loop
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

    public static void floydsTriangle(int n){
        int counter=1;
        // outer loop
        for(int i=1; i<=n; i++){
            // innner loop- how many times counter to be printed
            for(int j=1; j<= i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroandOnesPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }             
            }
            System.out.println();
        }
    }
    public static void butterflyPattern(int n){
    }
    public static void main(String[] args) {
        hollow_Rect(9, 10);
        inverted_halfrotated_pyramid(7);
        inverted_half_pyramid_numbers(5);
        floydsTriangle(5);
        zeroandOnesPattern(5);
    }
}
