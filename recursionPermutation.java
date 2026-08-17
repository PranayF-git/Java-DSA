public class recursionPermutation {
    public static void printPermutation(String str, int idx, String perm) {
        if(str.length() == ){
            System.out.println(perm);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, 1) + str.substring(i+1);
            printPermutation(newStr, idx+1, perm+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, 0, "");
    }
}