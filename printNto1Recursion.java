import java.util.*;
public class printNto1Recursion {
    public static void printNto1Nums(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNto1Nums(n - 1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program is running..");
        int n = sc.nextInt();
        printNto1Nums(n);
    }
}
