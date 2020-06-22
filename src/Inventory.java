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

public class Inventory {

    private  String tranmission;
    private int vinNumber;
    private String productname;
    private Boolean availability;
    private String make;
    private double price;
    private int year;
    private String model;
    private String color;
    private String bodyStyle;

    //Default Constructor
    Inventory(int Vn, String productName, Boolean availability, String make, double price, int year, String model, String color, String transmission, String bodyStyle) {
        this.productname = productName;
        this.availability = availability;
        this.make = make;
        this.price = price;
        this.year = year;
        this.model = model;
        this.color = color;
        this.tranmission = transmission;
        this.bodyStyle = bodyStyle;
        this.vinNumber = Vn;
    }

    public Inventory(){
        //empty construtor
    }

    public String getTranmission() {
        return tranmission;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public String getProductname() {
        return productname;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void inventoryRecord(){
        //have to print the arraylist which contains the Inventory Info
        System.out.println("Comming Soon");
    }
}