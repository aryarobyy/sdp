package com.example.sdp;

import com.example.sdp.model.Chocolate;
import com.example.sdp.model.Coffee;
import com.example.sdp.model.DrinkModel;
import com.example.sdp.model.Tea;

public class DrinkFactory {

    /**
     * Factory method untuk membuat objek Drink berdasarkan type
     * @param type Jenis minuman: "coffee", "tea", atau "chocolate"
     * @return Objek Drink yang sesuai dengan type
     */
    public DrinkModel createDrink(String type) {
        if (type == null || type.isEmpty()) {
            System.out.println("Error: Type cannot be null or empty!");
            return null;
        }

        switch (type.toLowerCase()) {
            case "coffee":
                System.out.println("Creating Coffee...");
                return new Coffee();

            case "tea":
                System.out.println("Creating Tea...");
                return new Tea();

            case "chocolate":
                System.out.println("Creating Chocolate...");
                return new Chocolate();

            default:
                System.out.println("Error: Unknown drink type '" + type + "'");
                System.out.println("Available types: coffee, tea, chocolate");
                return null;
        }
    }
}
