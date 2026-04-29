import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int marks[] = new int[3];
        // int[] marks = new int[3];
        // int[] marks = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i <= 4; i++) {
        //     System.out.print(marks[i]);
        // }
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String names[] = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }

    }
}
