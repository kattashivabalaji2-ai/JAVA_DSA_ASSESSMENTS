package MODULE_4;
class Student {

    static String collegeName = "ABC College";

    String studentName;

    Student(String name) {
        this.studentName = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }

    // Instance method
    void display() {
        System.out.println("Name: " + studentName);
        System.out.println("College: " + collegeName);
        System.out.println();
    }
}

public class StaticInstance {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Anita");

        s1.display();
        s2.display();
        Student.changeCollege("XYZ University");

        System.out.println("After changing college name:\n");

        s1.display();
        s2.display();
    }
}