import java.util.Scanner;

public class funcNumTable {
    public static int getNumTable(int n) {
        int table = 0;
        for (int i = 1; i <= 10; i++) {
            table = n * i;
            System.out.println(table);
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit to get table of that digits: ");
        int n = sc.nextInt();
        System.out.println("===========Here is your table============");
        getNumTable(n);
    }
}
