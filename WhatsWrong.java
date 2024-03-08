public class WhatsWrong {
    public static void main(String args[]) {
        for(int i=0;i<=5;i++ ) {
            System.out.println("i = "+i);
        }
        //System.out.println("i after loop = "+i);
    }
}
/*There is an error in this code. 
The variable i is declared inside the for loop, 
so it is only accessible within that block of code. 
Therefore, trying to access it outside the loop will 
result in a compilation error. */