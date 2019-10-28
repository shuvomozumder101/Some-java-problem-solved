

	import java.util.Scanner;
import java.util.jar.Attributes.Name;

	public class Manager extends Person{
		private String name;
	  int age;
	  final double fixedSalary=8000;
	  double eidBouns;
	  double honorableBouns;
	  double salary;
	  final double bounsRate=0.07;
	  double bounsAmount;
	  Scanner input;
	  
	  public Manager(){
	    super();
	   input = new Scanner(System.in);
	  }
	  public void input_All(){
	   System.out.println("Input name:");
	   name=input.nextLine();
	   System.out.println("Input age:");
	   age=input.nextInt();
	   System.out.println("Input salary:");
	   salary=input.nextInt();
	   System.out.println("Input eid bouns:");
	   eidBouns=input.nextInt();
	   System.out.println("Input honorable bouns:");
	   honorableBouns=input.nextInt();
	  }
	  public void eidBouns(double d){
	   eidBouns=d;
	  }
	  public void honorableBouns(double d){
	   honorableBouns=d;
	  }
	  
	   public void bounsCalculation(double allAccountBalance){
	     bounsAmount= allAccountBalance*bounsRate;
	  }
	  
	  public double salaryCalculation(){
	  salary=fixedSalary+honorableBouns+bounsAmount+eidBouns;
	  return salary;
	 }

	}
