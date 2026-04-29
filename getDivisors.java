import java.util.*;

public class getDivisors {

    public int[] divisors(int n) {
        int res[] = new int[n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res[index] = i;
                index++;
            }
        }

        int ans[] = new int[index];

        for (int i = 0; i < index; i++) {
            ans[i] = res[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find all of its divisors:");
        int n = sc.nextInt();

        getDivisors obj = new getDivisors();
        int result[] = obj.divisors(n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}