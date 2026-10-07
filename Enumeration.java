enum Status{                                        // Enumeration (enum)
    Started, Encrypting, Verifying, Succeed;
}

public class Enumeration {
    public static void main(String args[]){
        Status[] obj = Status.values();
        // System.out.print(obj[1]);

        for (Status s : obj) {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
