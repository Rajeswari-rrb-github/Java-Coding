public class HollowRhombus{
    public static void hollow_rhombus(int n){
        // outer loop
        for(int i= 1; i<=n; i++){
            // inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // hollow rectangle
            // inner loop- to traverse through columns
            for(int j=1; j<=n; j++){
                // cell= (i,j)
                if(i==1 || i==n || j==1 || j==n){
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
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}

