
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

import java.util.Scanner;

    public class Dealership {
        boolean exit;

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
                    Customer custArray = new Customer();
                    custArray.customerRecord();
                    break;
                case 2:
                    Inventory inventory = new Inventory();
                    inventory.inventoryRecord();
                    break;
                case 3:
                    salesPerson sales = new salesPerson();
                    sales.salesPersonsRecord();//(salespersonArray);
                    break;
                case 4:
                    Order order = new Order();
                    order.orderRecords();///*orderArray,transactionArray, custArray*);
                    break;
                case 5:
                    Transaction transaction = new Transaction();
                    transaction.transactionRecords(/*transactionArray*/);
                    break;

                default:
                    System.out.println("An unknown error has occurred. ");
                    break;
            }}}


