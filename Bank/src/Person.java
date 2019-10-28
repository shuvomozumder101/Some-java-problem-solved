import java.util.Scanner;
	public class Person {
	   private String name;
	   private Scanner input;
	  public Person(){
	   input = new Scanner(System.in);
	  }
	  public void input_name(){
	      System.out.println("Input Name:");
	      name=input.nextLine();
	  }
	}



