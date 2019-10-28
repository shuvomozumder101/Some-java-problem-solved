package supershop;
import java.util.Scanner;
public class Product {

    private String productCode;
    private String productName;
    private int productQuantity;
    private double unitPrice;
    private double salePrice;
    private int saleQuantity;
    private int remainingQuantity;
    private double totalPurchase;
    private double profit = 0.0;
    private Scanner input;

    public Product() {
        input = new Scanner(System.in);
    }
    public void inputAllProductInfo() {
        System.out.println("Enter product code:");
        productCode = input.nextLine();
        System.out.println("Enter product name:");
        productName = input.nextLine();
        System.out.println("Enter product quantity:");
        productQuantity = input.nextInt();
        System.out.println("Enter unit price:");
        unitPrice = input.nextDouble();
        System.out.println("Enter Sale price:");
        salePrice = input.nextDouble();

        remainingQuantity = productQuantity;
    }
    public void calculationQuantity(int q) {
        saleQuantity += q;
        remainingQuantity -= q;
    }
    public void calculatePurchase(int q) {
        totalPurchase = q * salePrice;
    }
    public double calculationProfit() {
        profit = (salePrice - unitPrice) * saleQuantity;
        return profit;
    }
    public String GetproductCode() {
        return productCode;
    }
    public double getSalePrice() {
        return salePrice;
    }
    public boolean IsProductAvailable(int pQ) {
        if (remainingQuantity >= pQ) {
            return true;
        } else {
            return false;
        }
    }
}
