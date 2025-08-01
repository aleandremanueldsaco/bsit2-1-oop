import java.util.Scanner;
public class Main {
    static String studentId = "";
    static String firstname = "";
    static String lastname = "";
    static String course = "";
    static String section = "";
    static int midterm = 0;
    static int finals = 0;
    static int project = 0;
    static int attendance = 0;
    static int averageScore = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student ID: ");
        studentId = scanner.nextLine();
        System.out.print("First Name: ");
        firstname = scanner.nextLine();
        System.out.print("Last Name: ");
        lastname = scanner.nextLine();
        System.out.print("Course: ");
        course = scanner.nextLine();
        System.out.print("Section: ");
        section = scanner.nextLine();
        System.out.println("Student ID:" + studentId);
        System.out.println("First Name:" + firstname);
        System.out.println("Last Name:" + lastname);
        System.out.println("Course:" + course);
        System.out.println("Section:" + section);


        System.out.println("Enter your score");

        System.out.print("Midterm Exam Score: ");
        midterm = scanner.nextInt();

        System.out.print("Final Exam Score: ");
        finals = scanner.nextInt();

        System.out.print("Project Score: ");
        project = scanner.nextInt();

        System.out.print("Attendance Score: ");
        attendance = scanner.nextInt();

        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midterm);
        System.out.println("Final Exam Score:" + finals);
        System.out.println("Project Score:" + project);
        System.out.println("Attendance Score:" + attendance);
        averageScore = midterm + finals + project + attendance / 400;

        System.out.println("Average Score: " + averageScore);
        if(averageScore >= 75) {
            System.out.println("Remarks:PASSED");
        } else {
            System.out.println("Remarks:FAILED");
        }

    }
}
