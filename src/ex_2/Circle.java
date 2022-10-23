package ex_2;

import ex_1.Main;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 5.0;
        this.color = "Yellow";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;    
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


}
