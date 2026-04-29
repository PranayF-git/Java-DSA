import java.util.Scanner;

class primeOrNot {
    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check - ");
        int n = sc.nextInt();
        checkPrime(n);
    }
}