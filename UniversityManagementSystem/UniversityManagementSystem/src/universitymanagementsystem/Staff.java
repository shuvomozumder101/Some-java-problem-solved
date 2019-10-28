package universitymanagementsystem;
import java.util.Scanner;
public class Staff extends Employee{
    private Scanner input=null;
    private final double StaffBonus=.05;
    private double YearlySalary;
    protected Staff(){
        super();
        input=new Scanner(System.in);
    }
    protected void calculate_YearlySalary(){
        YearlySalary=(get_MonthlySalary()*12)+(get_MonthlySalary()*12*StaffBonus);
    }
    protected double get_YearlySalary(){
        return YearlySalary;
    }
    protected void print_YearlySalary(){
        System.out.println("Yearly Salary : "+YearlySalary);
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
    }
}
