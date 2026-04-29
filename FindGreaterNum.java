import java.util.Scanner;

public class FindGreaterNum {
    public static int greaterNum(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            System.out.println("Both the numbers are equal!");
            
        }
        return greaterNum(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greaterNum(a, b));
    }
}
