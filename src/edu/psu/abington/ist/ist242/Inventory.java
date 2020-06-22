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

public class Inventory {


    public String model;
   public String make;
   public String color;
   public int vin;

   public Inventory(){

   }

    public Inventory(String model, String make, String color, int vin) {
        this.model = model;
        this.make = make;
        this.color = color;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getVin() {
        return vin;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public static void displayCars(){
        ArrayList<Inventory> iList = new ArrayList<>();
        Inventory Invt1 = new Inventory("Civic", "Honda", "red", 123456789);
        Inventory Invt2 = new Inventory("Pilot", "Honda", "black", 4464314);
        Inventory Invt3 = new Inventory("Accord", "Honda", "blue", 46410468);
        Inventory Invt4 = new Inventory("CRV", "Honda", "yellow", 6644347);
        Inventory Invt5 = new Inventory("Insight", "Honda", "blue", 634681468);
        Inventory Invt6 = new Inventory("Passport", "Honda", "black", 46846416);
        Inventory Invt7 = new Inventory("FIT", "Honda", "red", 864645);
        Inventory Invt8 = new Inventory("Clarity", "Honda", "red", 6468414);

        iList.add(Invt1);
        iList.add(Invt2);
        iList.add(Invt3);
        iList.add(Invt4);
        iList.add(Invt5);
        iList.add(Invt6);
        iList.add(Invt7);
        iList.add(Invt8);
        int i =0;
        for (Inventory Invt:iList){
            i++;
            System.out.println("Car " + i + " : ");
            System.out.println("Make: "+Invt.getMake());
            System.out.println("Model: "+Invt.getModel());
            System.out.println("Color: "+Invt.getColor());
            System.out.println("Vin: "+Invt.getVin());
            System.out.println("");

        }

    }
    //Default Constructor

    //public Boolean deleteCar(String vin) {
    //    System.out.println("Enter VIN to delete:");
    //    Scanner input = new Scanner(System.in);
    //    input.nextLine();
    //    try {
    //        for (Vehicle c : carsList1) {
    //            if (c.vin.equals(vin)) {
    //                carsList1.remove(c);
    //                System.out.println("Car with VIN: " + vin + " removed!");
    //                break;
    //            }
    //        }
    //    } catch (java.lang.Exception e){
    //        System.out.println(e.getMessage());
    //        return false;
    //    }
    //    return true;
    //}
}