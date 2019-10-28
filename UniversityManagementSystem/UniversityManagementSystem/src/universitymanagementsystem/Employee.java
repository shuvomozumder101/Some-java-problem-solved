package universitymanagementsystem;
import java.util.Scanner;
public class Employee extends Person{
    private Scanner input=null;
    private String EmployeeID;
    private double MonthlySalary;
    protected Employee(){
        super();
        input=new Scanner(System.in);
    }
    
    protected void input_EmployeeID(){
        System.out.println("Enter ID : ");
        EmployeeID=input.nextLine();
    }
    protected String get_EmployeeID(){
        return EmployeeID;
    }
    protected void print_EmployeeID(){
        System.out.println("EmployeeID : "+EmployeeID);
    }
    protected void input_MonthlySalary(){
        System.out.println("Enter MonthlySalary : ");
        MonthlySalary=input.nextDouble();
    }
    protected double get_MonthlySalary(){
        return MonthlySalary;
    }
    protected void print_ManthlySalary(){
        System.out.println("Manthly Salary : "+MonthlySalary);
    }
}
