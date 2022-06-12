package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car, Dannye> map = new HashMap<>();
        map.put(new Car(01,844), new Dannye(2019,"Lexus",50000,"$, black"));

        for(Map.Entry<Car, Dannye> CD : map.entrySet()){

            System.out.println();
            System.out.println("Key: "+CD.getKey()+" Value: "+CD.getValue().getYear()+", "+CD.getValue().getModel()+", "
                    + CD.getValue().getPrice()+" "+CD.getValue().getColour());
        }
    }
}
