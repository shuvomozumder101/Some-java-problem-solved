

	import java.util.Scanner;

	public class Person {

	    private Scanner input = null;
	    private String ID, NAME, CONTACT_NO;

	    protected Person() {
	        input = new Scanner(System.in);
	    }

	    protected void inputID() {
	        System.out.println("Enter ID :");
	        ID = input.nextLine();
	    }

	    protected String getID() {
	        return ID;
	    }

	    protected void printID() {
	        System.out.println("ID : " + ID);
	    }

	    protected void inputNAME() {
	        System.out.println("Enter Name :");
	        NAME = input.nextLine();
	    }

	    protected String getNAME() {
	        return NAME;
	    }

	    protected void printNAME() {
	        System.out.println("Name : " + NAME);
	    }

	    protected void inputContactNo() {
	        System.out.println("Enter CONTACT_NO :");
	        CONTACT_NO = input.nextLine();
	    }

	    protected String getContactNo() {
	        return CONTACT_NO;
	    }

	    protected void printContactNo() {
	        System.out.println("CONTACT NO : " + CONTACT_NO);
	    }
	}


