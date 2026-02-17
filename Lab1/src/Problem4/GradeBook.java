package Problem4;

import Practice2.Student;

public class GradeBook {
    private Course course;
    private Student[] students;
    private int studentCount;

    public GradeBook(Course course, int capacity){
        this.course=course;
        students =new Student[capacity];
        studentCount=0;
    }

    public void addStudent(Student student){
        if (studentCount < students.length) {
            students[studentCount++] = student;
        }
    }


    public void displayMessage(){
        System.out.println("Welcome to the grade book for " + course.toString() + "!");
    }

    public double determineClassAverage(){
        double sum = 0;

        for(int i=0; i<studentCount; i++){
            sum=sum+students[i].getGrade();
        }
        return sum/studentCount;
    }
    public void displayGradeReport() {
        if (studentCount == 0) return;

        Student low = students[0];
        Student high = students[0];

        for (int i = 1; i < studentCount; i++) {
            if (students[i].getGrade() < low.getGrade()) low = students[i];
            if (students[i].getGrade() > high.getGrade()) high = students[i];
        }
        System.out.printf("Class average is %.2f. ", determineClassAverage());
        System.out.print("Lowest grade is " + (int)low.getGrade() + " (Student " + low.getName() + ", id: " + low.getId() + ").\n");
        System.out.print("Highest grade is " + (int)high.getGrade() + " (Student " + high.getName() + ", id:" + high.getId() + ").\n");

        System.out.println();

        outputBarChart();
    }
    public void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] distribution = new int[11];

        for (int i = 0; i < studentCount; i++) {
            distribution[(int)students[i].getGrade() / 10]++;
        }

        for (int i = 0; i < distribution.length; i++) {
            if (i == 10) {
                System.out.print("  100: ");
            }
            else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int stars = 0; stars < distribution[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Override
    public String toString() {
        return "GradeBook for " + course.getName();
    }
}
