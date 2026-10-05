class College {
    static class Classroom {
        void show() {
            System.out.println("It is a classroom.");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        College.Classroom obj = new College.Classroom();
        obj.show();
    }
}
