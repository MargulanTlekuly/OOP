package Problem4;
import Practice2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course course = new Course("CS101", "Object-oriented Programming and Design", 5, "None");
        GradeBook gb = new GradeBook(course, 10);

        gb.displayMessage();
        System.out.println("\nPlease, input grades for students:");

        String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (String name : names) {
            System.out.print("Student " + name + ": ");
            double grade = sc.nextDouble();

            int id;

            if (name.equals("B")) {
                id = 4;
            } else if (name.equals("D")) {
                id = 87;
            } else {
                id = (int)(Math.random() * 100);
            }

            gb.addStudent(new Student(name, id, grade));
        }

        System.out.println();
        gb.displayGradeReport();
        sc.close();
    }
}