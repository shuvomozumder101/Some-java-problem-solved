import java.util.Scanner;
	public class Owner extends Person{
	 String acc_id;
	 double balance;
	 double withdrawAmount;
	 double depositAmount;
	 double loadAmount;
	 final double interestRate=0.1;
	 double interestAmount;
	 Scanner input;
	 public Owner(){
	  input = new Scanner(System.in);
	 }
	 public void inputAll(){
	  System.out.println("input account id:");
	  acc_id=input.nextLine();
	  System.out.println("input balance:");
	  balance=input.nextDouble();
	  withdrawAmount=0.0;
	  depositAmount=0.0;
	  interestAmount=0.0;
	  loadAmount=0.0;
	 }
	 public boolean checkLoad(){
	  if(balance>500)
	      return true;
	  else
	      return false;
	 }
	 public void input_loan(){
	  if(checkLoad())
	   loadAmount=input.nextDouble();
	  else
	   System.out.println("you can't take load");
	 }

	 public void deposit(double d){
	   depositAmount+=d;
	   balance=balance+d;
	 }
	 public void withdraw(double w){
	   if(balance>=w){
	    withdrawAmount+=w;
	    balance=balance-w;
	   }
	 }
	 public void interestCal(){
	  interestAmount=interestRate*loadAmount;
	 }
	 public double getBalance(){
	  return balance;
	 }
	 
	}



