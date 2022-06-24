package com.codedifferently.computer;

public class Computer {
    private String brand; //encapsulation making state of objects
    private String model;   //using functions to access
    private String os;
    private String memory;
    private Double price;

    public Computer(){  //non parameterized constructor
        this.brand = ""; //because there is nothing in the parenthesis
    }

    public Computer(String brand, String model, String os, String memory, Double price) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.memory = memory;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", memory='" + memory + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
