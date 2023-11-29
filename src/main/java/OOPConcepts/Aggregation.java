package OOPConcepts;
/* Aggregation in Java?
If a class has any entity reference, it is known as aggregation.
Displays HAS A relationship

The student class represents an individual student and has a name and a studentID attribute.
The University class represents a university which can contain multiple students.
It has a name attribute and a list of students and numberOfStudents variable to keep track
of the number of students.

The addStudent method in the university class allows you to add students to the university it
checks if there is space in the limit given before adding the student.

The Aggregation class / main method demonstrates how to create a university, add students to it
and retrieve and print the list of students in that university.

This example is aggregation as the University HAS-A relationship with multiple student objects.
The University class contains a list of student objects as its parts.
 */
public class Aggregation {
    public static void main(String[] args) {
        Student student1 = new Student("James", 1001);
        Student student2 = new Student("Lauren", 1002);
        Student student3 = new Student("Zuri", 1003);

        University myUniversity = new University("QA University", 3);
        myUniversity.addStudent(student1);
        myUniversity.addStudent(student2);
        myUniversity.addStudent(student3);

        //print all the university students
        Student[] universityStudents = myUniversity.getStudents();
        System.out.println("University: " + myUniversity.getName());
        System.out.println("Student: ");
        for (Student student : universityStudents){
            if (student != null){
                System.out.println("Name: " + student.getName() + "ID" + student.getStudentID());
            }
        }
    }

}

class Student {
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

}

class University {
    private String name;
    private int numberOfStudents;
    private Student[] students;
    //reference array

    public University(String name, int maxStudents) {
        this.name = name;
        students = new Student[maxStudents];
        numberOfStudents = 0;
    }

    public void addStudent(Student student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("University is Full");
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
