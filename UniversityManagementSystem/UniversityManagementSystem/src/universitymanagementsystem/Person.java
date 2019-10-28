package universitymanagementsystem;
import java.util.Scanner;
public class Person {
    private Scanner input=null;
    private String  FirstName,
                    LastName,
                    Department;
    private int Age;
    protected Person(){
        input=new Scanner(System.in);
    }
    protected void input_FirstName(){
        System.out.println("Enter First Name : ");
        FirstName=input.nextLine();
    }
    protected String get_Firstname(){
        return FirstName;
    }
    protected void input_LastName(){
        System.out.println("Enter Last Name : ");
        LastName=input.nextLine();
    }
    protected String get_Lastname(){
        return LastName;
    }
    protected void print_Name(){
        System.out.println("Name : "+FirstName+" "+LastName);
    }
    protected void input_Department(){
        System.out.println("Enter Department : ");
        Department=input.nextLine();
    }
    protected String get_Department(){
        return Department;
    }
    protected void print_Department(){
        System.out.println("Department : "+Department);
    }
    protected void input_Age(){
        System.out.println("Enter Age : ");
        Age=input.nextInt();
    }
    protected int get_Age(){
        return Age;
    }
    protected void print_Age(){
        System.out.println("Age : "+Age);
    }
}
