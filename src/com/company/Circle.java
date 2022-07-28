package com.company;

public class Circle {
   private   double pi;
   private double radius;

    public Circle(double pi, double radius) {
        this.pi = pi;
        this.radius = radius;
    }

    static void  area(double pi,double radius){
        System.out.println("Area = "+pi*(radius*radius));
    }
    static void circumference(double pi,double radius){
        System.out.println("Circumference = " + pi * 2 * radius);
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                '}';
    }
}

