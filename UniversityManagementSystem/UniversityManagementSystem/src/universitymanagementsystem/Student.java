package universitymanagementsystem;
import java.util.Scanner;
public class Student extends Person{
    private Scanner input=null;
    private String StudentID;
    private int EnrolledCourseNo=0;
    private Course[] EnrolledCourse=null;
    private static int Counter;
    protected Student(int n){
        super();
        input=new Scanner(System.in);
        Counter=0;
        EnrolledCourseNo=n;
        EnrolledCourse=new Course[EnrolledCourseNo];
    }
    protected void input_StudenID(){
        System.out.println("Enter ID : ");
        StudentID=input.nextLine();
    }
    protected String get_StudentID(){
        return StudentID;
    }
    protected void print_StudenID(){
        System.out.println("ID : "+StudentID);
    }
    protected int get_EnrolledCourseNo(){
        return EnrolledCourseNo;
    }
    protected void print_EnrolledCourseNo(){
        System.out.println("Enrolled Course No : "+EnrolledCourseNo);
    }
    protected void input_EnrolledCourse(Course c){
        EnrolledCourse[Counter]=c;
        Counter++;
    }
    protected int get_EnrolledCourse(){
        return EnrolledCourseNo;
    }
    protected void print_EnrolledCourse(){
        for (int i = 0; i < EnrolledCourseNo; i++) {
            EnrolledCourse[i].print_CourseCode();
            EnrolledCourse[i].print_CourseTitle();
            EnrolledCourse[i].print_CourseCredit();
        }
    }
    protected void input_All(){
        input_FirstName();
        input_LastName();
        input_StudenID();
        input_Department();
        input_Age();
    }
    protected void print_All(){
        print_Name();
        print_StudenID();
        print_Age();
        print_Department();
        print_EnrolledCourseNo();
        print_EnrolledCourse();
    }
}
