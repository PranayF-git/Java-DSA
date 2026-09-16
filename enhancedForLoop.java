class Student{
    int age;
    int roll_no;
    String name;
}

public class enhancedForLoop{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.age = 21;
        s1.roll_no = 12;
        s1.name = "Harsh";
        s2.age = 18;
        s2.roll_no = 25;
        s2.name = "Kartik";
        s3.age = 28;
        s3.roll_no = 29;
        s3.name = "Sparsh";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(Student stud : students){
            System.out.println(stud.name + ", " + stud.age + ", " + stud.roll_no);
        }
    }
}