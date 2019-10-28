package supershop;

import java.util.Scanner;

public class Person {

    private String name;
    private String id;
    private String address;
    Scanner input;

    public Person() {
        input = new Scanner(System.in);
    }

    public void inputName() {
        System.out.println("Enter Name:");
        name = input.nextLine();
    }
    public void printName(){
        System.out.println("Name : "+name);
    }
    public void inputAddress() {
        System.out.println("Enter Address:");
        address = input.nextLine();
    }
    public void printAddress(){
        System.out.println("Address : "+address);
    }
    public void inputId() {
        System.out.println("Enter ID:");
        id = input.nextLine();
    }
    public void printID(){
        System.out.println("ID : "+id);
    }
    public String getId() {
        return id;
    }

}
