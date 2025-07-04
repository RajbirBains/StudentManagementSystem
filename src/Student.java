import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses;
    private int gradeYear;
    private String studentID;
    private int tuitionBalance;
    private static int costOfCourse = 800; // Static = not specific to object (Isn't bound to certain instance, remains for all objects of Student)
    private static int id = 100;
    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student First Name: ");
        this.firstName = in.next();

        System.out.print("Enter Student Last Name: ");
        this.lastName = in.next();

        System.out.println("1 - 1st year \n2 - 2nd year \n3 - 3rd year \n4 - 4th year \nEnter Student Grad level: ");
        this.gradeYear = in.nextInt();


        id++; // Since ID is static, it will increment differently depending on instance
        generateStudentID();

        System.out.println("Name is " + this.firstName + " " + this.lastName + " and in year " + this.gradeYear + "and student ID " + this.studentID);

    }

    // Grade level + ID
    private void generateStudentID(){
        this.studentID = this.gradeYear + "" + this.id;
    }

    public void enroll(){
        Scanner in = new Scanner(System.in);
        String course = "";
        do {
            System.out.print("Enter course to enroll. (Q to quit) ");
            course = in.next();
            if(!course.equals("Q")){
                this.courses = this.courses + "\n" + course;
                this.tuitionBalance += costOfCourse;
            }
        }while (!course.equals("Q"));

        System.out.println("ENROLLED IN " + this.courses);
        System.out.println("TUITION BALANCE DUE " + this.tuitionBalance);
    }
}
