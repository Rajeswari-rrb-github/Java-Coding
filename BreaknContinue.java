public class BreaknContinue {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            System.out.println(i);
            System.out.println("java is cool!");
            if (i==2) {
                System.out.println("ending the loop here!");
                break; // break statement
            }
            if (i==5) {
                System.out.println("ending the loop here!");
                continue; // continue statement
            }
        }
            
        }
}