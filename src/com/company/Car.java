package com.company;

public class Car {
    private int Id;
    private int numberCar;

    public Car(int id, int numberCar) {
        Id = id;
        this.numberCar = numberCar;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return "Car Id: " + Id +
                ", numberCar: " + numberCar +
                ". ";
    }
}
