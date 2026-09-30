package ThisSuper;

class Human {
    Human() {
        System.out.println("Inside normal constructor - Human");
    }

    Human(int n) {
        super();
        System.out.println("Inside Paramatrized constructor - Human");
    }
}

class Man extends Human {
    Man() {
        System.out.println("Inside normal constructor - Man");
    }

    Man(int n) {
        this();
        System.out.println("Inside parameterized constructor - Man");
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Man m = new Man(5);
    }
}