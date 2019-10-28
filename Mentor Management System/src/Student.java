import java.util.Scanner;

public class Student extends Person {

    private Scanner input = null;
    private String ADVISOR_ID=null;
    private int ABSENT_DAYS = 0;
    private double CGPA = 0.0, PAYBLE = 0.0, PAID = 0.0;

    protected Student() {
        super();
        input = new Scanner(System.in);
    }

    protected void inputAdvisorID() {
        System.out.println("Enter Advisor ID : ");
        ADVISOR_ID = input.nextLine();
    }

    protected void setAdvisorID(String s){
        ADVISOR_ID=s;
    }
    protected String getAdvisorID() {
        return ADVISOR_ID;
    }

    protected void inputAbsentDays() {
        System.out.println("Enter ABSENT DAYS :");
        ABSENT_DAYS = input.nextInt();
    }

    protected int getAbsentDays() {
        return ABSENT_DAYS;
    }

    protected void printAbsentDays() {
        System.out.println("ABSENT DAYS : " + ABSENT_DAYS);
    }

    protected void inputCGPA() {
        System.out.println("Enter CGPA :");
        CGPA = input.nextDouble();
    }

    protected double getCGPA() {
        return CGPA;
    }

    protected void printCGPA() {
        System.out.println("CGPA : " + CGPA);
    }

    protected void inputPAYBLE() {
        System.out.println("Enter PAYBLE :");
        PAYBLE = input.nextDouble();
    }

    protected double getPAYBLE() {
        return PAYBLE;
    }

    protected void printPAYBLE() {
        System.out.println("PAYBLE : " + PAYBLE);
    }

    protected void inputPAID() {
        System.out.println("Enter PAID :");
        PAID = input.nextDouble();
    }

    protected double getPAID() {
        return PAID;
    }

    protected void printPAID() {
        System.out.println("PAID : " + PAID);
    }

    protected void inputAll() {
        inputID();
        inputNAME();
        inputContactNo();
        inputAbsentDays();
        inputCGPA();
        inputPAYBLE();
        inputPAID();
    }

    protected void printAll() {
        printID();
        printNAME();
        printContactNo();
        printAbsentDays();
        printCGPA();
        printPAYBLE();
        printPAYBLE();
    }
}