import java.util.Scanner;

public class Clint {
	
	 protected String name;
	public String id;
	 protected Scanner sc;
	  
	  
	 protected void reg(String name, String id){
		   Scanner sc=new Scanner(System.in);
		   
	}
	 protected void ClintName() {
		   System.out.println("Enter Clint Name:");   
		   name=sc.nextLine();
	   }
	 protected void ClintId() {
		   System.out.println("Enter Clint ID:");
		   id=sc.nextLine();
		   
	   }
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	protected void InputNameId() {
		   ClintName();
		   ClintId();
	   }

}
