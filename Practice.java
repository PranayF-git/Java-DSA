class School {
    int rooms = 12;
    String name = "JVM";

    void show() {
        System.out.println("In school");
    }
}

class Classroom extends School {
    void show() {
        System.out.println("In classroom " + rooms);
    }
}

public class Practice {
    public static void main(String[] args) {
        School obj = new Classroom();
        obj.show();
        obj = new School();
        obj.show();
    }
}