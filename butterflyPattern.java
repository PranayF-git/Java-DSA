public class butterflyPattern {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (x - i);
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
 
        for (int i = x; i >=1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (x - i);
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
