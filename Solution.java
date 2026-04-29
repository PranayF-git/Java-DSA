import java.util.*;

class Solution {
    // public void pattern6(int n) {
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    // public void pattern7(int n) {
    //     for(int i=1; i<=n; i++){
    //         for (int j = n - i; j <= i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= 2 * i - 1; j++) {
    //             System.out.print("* ");
    //         }
    //         for (int j = n - i; j <= i; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public void pattern11(int n) {
    //     int start = 1;
    //     for (int i = 0; i < n; i++) {
    //         if (i % 2 == 0)
    //             start = 1;
    //         else
    //             start = 0;
    //             for (int j = 0; j <= i; j++) {
    //                 System.out.print(start);
    //                 start = 1-start;
    //             }
    //         System.out.println();
    //     }
    // }

    public void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for (int i = 0; i <= n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    public void pattern15(int n) {
        for (int i = n - 1; i >= 1; i--) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    public void pattern16(int n) {
        for (int i = n - 1; i >= 1; i--) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char)('A'+i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        obj.pattern17(n);
    }
}