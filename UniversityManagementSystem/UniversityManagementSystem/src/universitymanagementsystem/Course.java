package universitymanagementsystem;
import java.util.Scanner;
public class Course {
    private Scanner input=null;
    private String  CourseCode;
    private String  CourseTitle;
    private int CourseCredit;
    private int CourseCounter=0;
    protected Course(){
        input=new Scanner(System.in);
    }
    protected void input_CourseCode(){
        System.out.println("Enter Course Code : ");
        CourseCode=input.nextLine();
    }
    protected String get_CourseCode(){
        return CourseCode;
    }
    protected void print_CourseCode(){
        System.out.println("Course Code : "+CourseCode);
    }
    protected void input_CourseTitle(){
        System.out.println("Enter Course Title : ");
        CourseTitle=input.nextLine();
    }
    protected String get_CourseTitle(){
        return CourseTitle;
    }
    protected void print_CourseTitle(){
        System.out.println("Course Title : "+CourseTitle);
    }
    protected void input_CourseCredit(){
        System.out.println("Enter Course Credit : ");
        CourseCredit=input.nextInt();
    }
    protected int get_CourseCredit(){
        return CourseCredit;
    }
    protected void print_CourseCredit(){
        System.out.println("Course Credit : "+CourseCredit);
    }
    protected void calculate_CourseCounter(){
        CourseCounter++;
    }
    protected int get_CourseCounter(){
        return CourseCounter;
    }
    protected void print_CourseCounter(){
        System.out.println("No Of Enrolled Student : "+CourseCounter);
    }
    protected void input_All(){
        input_CourseCode();
        input_CourseTitle();
        input_CourseCredit();
    }
    protected void print_All(){
        print_CourseCode();
        print_CourseTitle();
        print_CourseCredit();
        print_CourseCounter();
    }
}
