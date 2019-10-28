package universitymanagementsystem;
import java.util.Scanner;
public class Teacher extends Employee{
    private Scanner input=null;
    private final double TeacherBonus=.1;
    private double YearlySalary;
    private int CourseCredit=0;
    private int NoOfCourse;
    protected Teacher(){
        super();
        input=new Scanner(System.in);
    }
    protected void calculate_YearlySalary(){
        YearlySalary=(get_MonthlySalary()*12)+(get_MonthlySalary()*12*TeacherBonus);
    }
    protected double get_YearlySalary(){
        return YearlySalary;
    }
    protected void print_YearlySalary(){
        System.out.println("Yearly Salary : "+YearlySalary);
    }
    protected void set_NoOfCourse(int n){
        NoOfCourse=n;
    }
    protected double get_NoOfCourse(){
        return NoOfCourse;
    }
    protected void print_NoOfCourse(){
        System.out.println("No Of Course : "+NoOfCourse);
    }
    protected void calculate_CourseCrdit(int n){
        CourseCredit+=n;
    }
    protected int get_CourseCredit(){
        return CourseCredit;
    }
    protected void print_CourseCredit(){
        System.out.println("Course Credit Hour : "+CourseCredit);
    }
    protected void input_All(){
        input_FirstName();
        input_LastName();
        input_EmployeeID();
        input_Department();
        input_Age();
        input_MonthlySalary();
        calculate_YearlySalary();
    }
    protected void print_All(){
        print_Name();
        print_EmployeeID();
        print_Age();
        print_Department();
        print_YearlySalary();
        print_CourseCredit();
    }
}
