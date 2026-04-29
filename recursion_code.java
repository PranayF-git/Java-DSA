import java.util.Scanner;
public class recursion_code{
    // public static void printName(int n) {
    //     if (n == 0) return;
    //     System.out.println("Prince");
    //     printName(n - 1);
    // }
    public static void printNum(int n) {
        if (n == 0) return;
        printNum(n - 1);
        System.out.println(n);
    }
    public static void main(String args[]){
        System.out.println("Program running...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        printNum(n);
    }
}