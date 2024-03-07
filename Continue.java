public class Continue {
    public static void main(String[] args) {
        for (int index = 1; index <= 5; index++) {
            if (index==3) {
                continue;
            }
            System.out.println(index);
        }
    }
}
