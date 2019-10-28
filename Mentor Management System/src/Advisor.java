

	import java.util.Scanner;

	public class Advisor extends Person {

	    private Scanner input = null;
	    private int NO_OF_STUDENT = 0;

	    protected Advisor() {
	        super();
	        input = new Scanner(System.in);
	    }

	    protected void calculateNoOfStudent() {
	        NO_OF_STUDENT++;
	    }

	    protected boolean cheackNoOfStudent() {
	        if ( NO_OF_STUDENT <= 40) {
	            return true;
	        }
	        else if(NO_OF_STUDENT!=40) {
	            return false;
	        }
	        return false;
	    }

	    protected int getNoOfStudent() {
	        return NO_OF_STUDENT;
	    }

	    protected void printNoOfStudent() {
	        System.out.println("No Of Student" + NO_OF_STUDENT);
	    }

	    protected void ShowDue(double n) {
	        if (n > 0) {
	            System.out.println("Due : " + n);
	        }
	        else System.out.println("No Due..");
	    }

	    protected boolean ShowLowCGPA(double n) {
	        if (n < 3.0) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    protected boolean ShowAbsentNames(int n) {
	        if (n > 10) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    protected void inputAll() {
	        inputID();
	        inputNAME();
	        inputContactNo();
	    }

	    protected void printAll() {
	        printID();
	        printNAME();
	        printContactNo();
	    }
	}


