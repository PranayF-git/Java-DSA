import java.util.Scanner;

public class funcEvenOdd {
    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
            return;
        } else {
            System.out.println("Odd");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check for even-odd: ");
        int n = sc.nextInt();
        checkEvenOdd(n);
    }
}
