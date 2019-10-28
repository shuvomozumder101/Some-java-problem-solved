package supershop;

public class Customer extends Person {

    private String customerType;
    private final double discount = 0.1;
    private int totalPoint = 0;
    private double totalPurchase = 0.0;

    public Customer() {
        super();
    }

    public void inputCustomerType() {
        System.out.println("Enter Customer Type:");
        customerType = input.nextLine();
    }

    public String getCustomerType() {
        return customerType;
    }
    public void printCustomerType(){
        System.out.println("Customer Type : "+customerType);
    }
    public double calculateDiscount(double tp) {
        if (getCustomerType().equalsIgnoreCase("member")) {
            return tp * discount;
        } else {
            return 0.0;
        }
    }

    public int calculatePoint(double tp) {
        int cPoint = (int) (tp / 100);
        totalPoint += cPoint;
        return cPoint;
    }
    public void printPoint(){
        System.out.println("Total Point : "+totalPoint);
    }
}
