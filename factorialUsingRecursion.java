import java.util.Scanner;

public class factorialUsingRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program is running..");
        System.out.println("Enter any number to find its factorial: ");
        int n = sc.nextInt();
        System.out.println(n * factorial(n-1));
    }
}
