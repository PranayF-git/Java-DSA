import java.util.Scanner;

class Functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int calcSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }

    // public static int calcProduct(int a, int b){
    //     return a * b;
    // }

    public static void printFactorial(int n) {
        
        int fact = 1;
        if (n <= 0){
            System.out.println("Invalid number!");
            return;
        }

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.next();
        // printMyName(name);
        System.out.println("Enter any 1 number: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}