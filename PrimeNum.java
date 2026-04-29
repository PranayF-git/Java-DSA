import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for prime number: ");
        int a = sc.nextInt();
        boolean isPrime = true;
        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number!");
        }
    }
}
