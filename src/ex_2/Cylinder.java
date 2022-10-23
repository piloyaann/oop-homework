package ex_2;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        this.height = 15.0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(double radius, double height){
        return (2 * getArea(getRadius())) + (2 * (Math.PI * this.getRadius() * this.height));
    }


}
