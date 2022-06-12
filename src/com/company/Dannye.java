package com.company;

public class Dannye {
    private int year;
    private String model;
    private int price;
    private String colour;

    public Dannye(int year, String model, int price, String colour) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return " Dannye year: " + year +
                ", model: " + model + '\'' +
                ", price: " + price +
                ", colour: '" + colour + '\'' +
                ". ";
    }
}
