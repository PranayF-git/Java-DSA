public class reverseStringRecurr {
    public static void stringRev(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringRev(str, index-1);
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Program is running..");
        stringRev(str, str.length()-1);
    }
}
