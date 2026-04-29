import java.util.Scanner;

public class FindExponentOfNum {
    public static int findExpo(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power to calculate for entered number: ");
        int n = sc.nextInt();
        System.out.println(x+" raised to the power "+n+" is: "+findExpo(x, n));
    }
}
