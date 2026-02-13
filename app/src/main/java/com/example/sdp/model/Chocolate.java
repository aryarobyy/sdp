package com.example.sdp.model;

public class Chocolate implements DrinkModel {
    private int temperature;

    public Chocolate() {
        this.temperature = 70; // dalam Celsius
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Hot Chocolate...");
        System.out.println("- Melting chocolate");
        System.out.println("- Heating milk to " + temperature + "°C");
        System.out.println("- Mixing chocolate with milk");
        System.out.println("- Adding whipped cream");
    }

    @Override
    public void serve() {
        System.out.println("🍫 Serving delicious Hot Chocolate!");
        System.out.println("---");
    }
}