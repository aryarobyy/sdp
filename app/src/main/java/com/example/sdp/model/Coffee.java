package com.example.sdp.model;

public class Coffee implements DrinkModel {
    private String type;

    public Coffee() {
        this.type = "Espresso";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + type + " coffee...");
        System.out.println("- Grinding coffee beans");
        System.out.println("- Heating water to 90°C");
        System.out.println("- Brewing coffee");
    }

    @Override
    public void serve() {
        System.out.println("☕ Serving hot " + type + " coffee!");
        System.out.println("---");
    }
}