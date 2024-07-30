package org.example.model;

public class Wall {
    private String direction;

    // Constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // Getter for direction
    public String getDirection() {
        return direction;
    }

    // Method to indicate the creation of the wall
    public void create() {
        System.out.println("Wall has been built.");
    }
}