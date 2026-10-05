class Student {
    void Data() {
        System.out.println("Here you will see student's data in future.");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Student obj = new Student() { //Anonymous Inner class
            void Data() {
                System.out.println("Overrided the Student's data");
            }
        };
        obj.Data();
    }
}
