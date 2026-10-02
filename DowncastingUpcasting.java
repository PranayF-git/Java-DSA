class Phone {
    void print1() {
        System.out.println("This is a Phone class");
    }
}

class SmartPhone extends Phone {
    void print2() {
        System.out.println("This is a SmartPhone class");
    }
}

public class DowncastingUpcasting {
    public static void main(String[] args) {
        // Upcasting: Parent reference to Child object
        Phone obj = new SmartPhone();
        obj.print1();

        // Downcasting: Child reference from Parent reference
        SmartPhone obj2 = (SmartPhone) obj;
        obj2.print2();
    }
}
