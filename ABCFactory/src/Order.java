import java.util.Scanner;

public class Order extends Clint {
	
	
	protected Scanner sc;
	public String id;
	protected double amount;
	public double total_bill=0;
	protected double price;
	
	protected Order() {
		super();
		
	}
      
	
	protected void orderinfo (){
        
        if(amount>5000){
            System.out.println("Thank you for ordering");
            
        }else{
            System.out.println ("Sorry you need to order amount more then 5000");
        }
    }
    
	protected void calculation(double price){
        total_bill=amount*price;
        System.out.println("Total price:"+total_bill);
        
        total_bill=+total_bill*0.05;
        
        System.out.println("Total price + 5% vat:"+total_bill);
    }

}
