import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        float radii= sc.nextFloat();
        float area= 3.14f* radii* radii;
        System.out.println(area);
    }
}
