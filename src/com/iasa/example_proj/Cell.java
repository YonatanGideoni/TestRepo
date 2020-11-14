package com.iasa.example_proj;

public class Cell {
    int x;
    int y;
    private int velocity;

    public Cell(int x, int y, int velocity) {
        this.velocity = velocity;
        this.x = x;
        this.y = y;
    }

    public void moveX() {
        x += velocity;
    }

    public void moveY() {
        y += velocity;

        printVelocity();
    }

    private void printVelocity() {
        System.out.println(velocity);
    }
}
