import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses;
    private int gradeYear;
    private int studentID;
    private int tuitionBalance;
    private int costOfCourse = 800;

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student First Name: ");
        this.firstName = in.next();

        System.out.print("Enter Student Last Name: ");
        this.lastName = in.next();

        System.out.println("1 - 1st year \n2 - 2nd year \n3 - 3rd year \n4 - 4th year \nEnter Student Grad level: ");
        this.gradeYear = in.nextInt();

        System.out.println("Name is " + this.firstName + " " + this.lastName + " and in year " + this.gradeYear);
    }
}
