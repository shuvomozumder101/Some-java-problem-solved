
import java.util.Scanner;

public class Supervisor extends Order {
	protected Scanner sc;
    protected Double discount;
    private String name,id;

	protected Supervisor() {
		super();
	}
	void check(){
	if(id.equals(id)){
        System.out.println("You are reg. clint.");
        if(amount>1000){
            System.out.println("Youre order more then 10000. You get discount by supervisor.");
            Double discount;
            System.out.println("Input discount value in % (10%)");
            Scanner ss=new Scanner(System.in);
            discount=ss.nextDouble();
            Double finalPrice=total_bill-total_bill*10/100;
            System.out.println("You nedd to pay"+ finalPrice);
}
        
}
	}
	}