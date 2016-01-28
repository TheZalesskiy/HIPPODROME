package com.thezalesskiy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move() {
        setDistance(this.distance += speed * Math.random());

    }

    public void print() throws IOException {
        for (int i = 0; i < distance; i++) {
            System.out.print(".");
        }
        System.out.println(this.getName());


    }
}
