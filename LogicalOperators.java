public class LogicalOperators {
    public static void main(String[] args) {

        // AND operators
        boolean a = true;
        boolean b= false;
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // OR operator
        if(a || b){ // pipe operator---> logical or
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if(a != b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
    }
}
