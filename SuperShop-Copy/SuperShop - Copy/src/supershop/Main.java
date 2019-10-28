package supershop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employee:");
        int num = input.nextInt();
        Employee E[] = new Employee[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Input Employee Information:");
            E[i] = new Employee();
            E[i].inputId();
            E[i].inputName();
            E[i].inputAddress();
            E[i].inputSalary();
        }

        System.out.println("Enter the number of Customer:");
        int cnumber = input.nextInt();
        Customer C[] = new Customer[cnumber];
        for (int i = 0; i < cnumber; i++) {
            System.out.println("Input Customer Information:");
            C[i] = new Customer();
            C[i].inputId();
            C[i].inputName();
            C[i].inputAddress();
            C[i].inputCustomerType();
        }

        System.out.println("Enter the number of product:");
        int p = input.nextInt();
        Product pro[] = new Product[p];
        for (int i = 0; i < p; i++) {
            pro[i] = new Product();
            System.out.println("Input Product Information:");
            pro[i].inputAllProductInfo();
        }

        while (true) {
            // find customer
            System.out.println("enter customer id for sale:");
            input.nextLine();
            String c_id = input.nextLine();
            Customer cfind = null;
            for (int i = 0; i < cnumber; i++) {
                if (C[i].getId().equals(c_id)) {
                    cfind = C[i];
                    break;
                }
            }
            // shoping
            double totalP = 0.0;
            while (true) {
                System.out.println("input product code:");
                String pcode = input.nextLine();
                System.out.println("enter product Quantity:");
                int pQ = input.nextInt();
                Product pfind = null;
                for (int i = 0; i < p; i++) {  // product search
                    if (pro[i].GetproductCode().equals(pcode)) {
                        pfind = pro[i];  // find product
                        break;
                    }
                }
                // product avaiable check with  pfind object
                if (pfind.IsProductAvailable(pQ)) {
                    totalP += pfind.getSalePrice() * pQ; // price calculate
                    pfind.calculationQuantity(pQ); // quantiry reduce
                }
                System.out.println("Do You Want to Add more Product (true/false): ");
                if (!input.nextBoolean()) {
                    break;
                }
                input.nextLine();
            }
            // discount with cfind object
            // point calculate with cfind object
            double pointEarn = cfind.calculatePoint(totalP);
            double disCountAmount = cfind.calculateDiscount(totalP);
            double totalBill = totalP - disCountAmount;
            cfind.printID();
            cfind.printName();
            cfind.printAddress();
            cfind.printCustomerType();
            System.out.println("Total Purchase Amount : "+totalBill);
            cfind.printPoint();
            System.out.println("Calculate For More Customer(true / false) : ");
            if(!input.nextBoolean())break;
        }
    }
}
