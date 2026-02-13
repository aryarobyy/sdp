package com.example.sdp.model;

public class Tea implements DrinkModel {
    private String type;

    public Tea() {
        this.type = "Green Tea";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + type + "...");
        System.out.println("- Boiling water");
        System.out.println("- Steeping tea leaves for 3 minutes");
        System.out.println("- Straining tea");
    }

    @Override
    public void serve() {
        System.out.println("🍵 Serving warm " + type + "!");
        System.out.println("---");
    }
}