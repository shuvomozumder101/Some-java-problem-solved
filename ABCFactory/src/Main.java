import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
        Clint c=new Clint();
        c.InputNameId();
        
      
        Order o=new Order();
        
        System.out.println("Input order ID:");
        o.id=sc.nextLine();
        System.out.println("Input order amount:");
        o.amount=sc.nextDouble();
        
        if(o.equals(c.id)){
            System.out.println("You are Clint.");
           
            if(o.amount>1000){
                System.out.println("Input discount value in % (10%)");
              
      Supervisor s=new Supervisor();
      s.check();
	}

        }
	}
	}
