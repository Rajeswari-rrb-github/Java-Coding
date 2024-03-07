public class Binary_TO_Decimal {
    public static void binaryToDec(int bi_num){
        int my_num = bi_num;
        int pow =0;
        int dec = 0;

        while(bi_num>0){
            int lastDigit= bi_num % 10;
            dec=dec+(lastDigit* (int) Math.pow(2,pow));

            pow++;
            bi_num/=10;
        }
        System.out.println("decimal of "+ my_num+ " = "+dec);
    }
    public static void main(String[] args) {
        binaryToDec(101010111);
    }
}
