package issues03.i223.e21.test1;

public class Test {

    public static void main(String[] args) {

        Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
    }

    private static void review(Student stud, int marks) {
        marks = marks + 10;
        stud.marks += marks;
    }

}

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}