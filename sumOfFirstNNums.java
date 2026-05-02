import java.util.Scanner;

public class sumOfFirstNNums {
    public static void sumofFNNum(int n) {
        int sum = 0;
        if (n < 1) {
            return;
        }
        System.out.println(n, sum + n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program is running..");
        int n = sc.nextInt();
        sumofFNNum(n);
    }
}
