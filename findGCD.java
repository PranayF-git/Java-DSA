import java.util.*;
class findGCD{
    public static int gcd(int a, int b) {
        
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a, b);
        System.out.println("GCD of two given numbers: "+gcd(a, b));
    }
}