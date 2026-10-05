interface Student {
    void RollNum();

    void Name();
}

interface Teacher {
    void ID();
}

interface Syllabus extends Teacher { //To inherit an interface inside an interface use "extends" keyword
    void Academics();
}

class StudentData implements Student, Teacher { //Inheriting an or multiple interfaces using "implements" keyword to an class.
    public void RollNum() {
        System.out.println("Roll number: 21");
    }
    
    public void Name() {
        System.out.println("Name: Pranay");
    }

    public void ID() {
        System.out.println("Teacher ID: 005");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        StudentData stu = new StudentData();
        stu.RollNum();
        stu.Name();
        stu.ID();
    }
}
