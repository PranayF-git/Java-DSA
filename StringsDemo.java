import java.util.*;
public class StringsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // =========String declaration=========
        // String name = "Virat";
        // String fullName = "Viral Kohli";
        // String sentence = "I am the king of RCB";
        // String nameInput = sc.nextLine();
        // System.out.println(nameInput);

        // =====Concatenation 
        // String firstName = "Virat ";
        // String lastName = "Kohli";
        // String fullName = firstName + lastName;
        // System.out.println(fullName);

        // Length function
        // System.out.println("Length: " + fullName.length());

        // =======charAt function========
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // =====Compare=======
        // String name1 = "Tony";
        // String name2 = "Tony";
        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // =====Why use "compareTo() function and not "==" operator====
        // if (new String("Tony") == new String("Tony")) {
        //     System.out.println("Strings are equal");

        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // =====Substring(Extract any part from the string)=======
        String sentence = "ViratKohli";
        String name = sentence.substring(2, 8);
        System.out.println(name);
    }
}
