import java.util.*;
public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, marks;
        do{
            System.out.println("Enter 1 for getting the result or 0 to end the program: ");
            System.out.print("Your number: ");
            input = sc.nextInt();
            if (input == 1) {
                System.out.print("Enter your marks: ");
                marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Please enter valid marks!");
                }
            } else{
                System.out.println("Please either choose 1 or 0!");
            }
        } while (input == 1);
        System.out.println("Program ended...");
    }
}
