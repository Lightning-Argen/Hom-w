package com.company;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.14, 50);
        System.out.println("PI = " + circle.getPi() + " Radius = " + circle.getRadius());
         Circle.area(circle.getPi(), circle.getRadius());
        Circle.circumference(circle.getPi(), circle.getRadius());
    }
}