import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select operation that you want to perform:");
        System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Modulo or remainder");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Sum: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Division: "+(a/b));
                break;
            case 5:
                System.out.println("Modulo/remainder: "+(a%b));
                break;
            default:
                System.out.println("Operation does not exists!");
        }
    }
}
