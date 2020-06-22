
/*
Project: Car Design
Purpose Details: Car Dealership Application
Course: IST 242
Team 4
Developed: June 14, 2020
Last date Changed: June 21, 2020
Rev: 1
*/
package edu.psu.abington.ist.ist242;
import java.util.*;
public class Dealership {
    boolean exit;
    ArrayList<Customer> cList = new ArrayList<>();






    public void runDealership() {
        printHeader();
        while(!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }
    private void printHeader() {
        System.out.println("---------------------------------------------------------");
        System.out.println("                   Car Dealership                        ");
        System.out.println("                        by:                              ");
        System.out.println("                     Team   4                            ");
        System.out.println("---------------------------------------------------------");
    }
    private void printMenu(){
        System.out.println("\nMAIN MENU SELECTION:");
        System.out.println("1 - Customers page. ");
        System.out.println("2 - Inventory page ");
        System.out.println("3 - Sales Person page. ");
        System.out.println("4 - Order page. ");
        System.out.println("5 - Transaction Page ");
        System.out.println("0 - Quit the Program. ");
    }
    private int getInput() {
        Scanner menuInput = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice > 5) {
            try {
                System.out.print("\nPlease enter your selection: ");
                choice = Integer.parseInt(menuInput.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }
    private void performAction(int choice){
            switch (choice){
                case 0:
                    exit = true;
                    System.out.println("Thank you for visiting!");
                    break;
                case 1:
                    //Customer custArray = new Customer();
                    String answer;
                    Scanner input = new Scanner(System.in);
                    System.out.print("Create Customer, Read Customers, Delete Customer: ");
                    answer = input.nextLine();
                        switch (answer) {
                            case "create":
                                cList.add(addCustomer());
                                break;
                            case "read":
                                User.customerRecord(cList);
                                break;
                            default: System.out.println("Invalid please, retry");break;
                        }


            case 2:
                Inventory.displayCars();
                break;
            case 3:
                //salesPerson sales = new salesPerson();
                //sales.salesPersonsRecord();//(salespersonArray);
                break;
            case 4:
                //Order order = new Order();
                //order.orderRecords();///*orderArray,transactionArray, custArray*);
                break;
            case 5:
                //Transaction transaction = new Transaction();
                //transaction.transactionRecords(/*transactionArray*/);
                break;
            default:
                System.out.println("An unknown error has occurred. ");
                break;
        }}
    public Customer addCustomer(){
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.print("Enter you name: ");
        customer.setUserName((input.nextLine()));
        System.out.print("Enter you ID: ");
        customer.setUserId((input.nextInt()));
        input.nextLine();
        System.out.print("Enter you Phone: ");
        customer.setUserPhone(input.nextLine());
        System.out.print("Enter you Address: ");
        customer.setUserAddress(input.nextLine());
        return customer;
    }
}

