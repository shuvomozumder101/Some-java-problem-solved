public class Main {
	 public static void main(String[] args) {
	      Owner accObj = new Owner();
	      System.out.println("input Account 1:");
	      
	      accObj.input_name();
	      accObj.inputAll();
	      accObj.deposit(50000);
	      accObj.withdraw(40000);
	      
	      double getBalance=accObj.getBalance();
	     System.out.println("current balance: "+getBalance);
	     
	     
	     Manager obj = new Manager();
	      System.out.println("input manage:");
	     
	      obj.input_All();
	      
	      obj.bounsCalculation(getBalance);
	      double managerSalary =  obj.salaryCalculation();
	      System.out.println("manager salary is: "+managerSalary);
	      
	      
	   
	 }  
	}
