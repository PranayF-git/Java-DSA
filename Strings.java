import java.util.*;
public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("helloworld");
        

        // To replace the charcter
        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0, 'A');
        // System.out.println(sb);

        // // To insert a character in the string
        // sb.insert(0, 'S');
        // System.out.println(sb);

        // sb.insert(2, 'r');
        // System.out.println(sb);

        // // To delete a character or set of characters in a string
        // sb.delete(0, 4);
        // System.out.println(sb);

        // sb.append('e');
        // sb.append('l');
        // sb.append('l');
        // sb.append('o');
        // System.out.println(sb.length());
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
