package org.example.model;

import org.example.model.enums.LampType;


public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // Method to turn on the lamp
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    // Getter for style
    public LampType getStyle() {
        return style;
    }

    // Getter for battery
    public boolean isBattery() {
        return battery;
    }

    // Getter for globRating
    public int getGlobRating() {
        return globRating;
    }
}
