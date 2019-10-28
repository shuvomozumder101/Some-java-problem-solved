package supershop;

public class Employee extends Person {

    private double salary;

    public Employee() {
        super();
    }

    public void inputSalary() {
        System.out.println("Enter salary of the employee:");
        salary = input.nextDouble();
    }

    public double getSalary() {
        return salary;
    }
}
