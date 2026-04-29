import java.util.*;

public class FindCircumferenceOfCircle {
    public static double circumference(double r) {
        double pi = 3.14;
        double c = 2 * pi * r;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        // circumference(r);
        System.out.println(circumference(r));
    }
}
