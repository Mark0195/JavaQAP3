package Problem2;

//public Circle that extends from shape
public class Circle extends Shape{
    protected double radius;

    //public that sets radius value
    public Circle(double radius) {
        radius = 1.0;
    }

    //public super to get color, filled and radius
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    //double to getRadius
    public double getRadius() {
        return this.radius;
    }
    //void to setRadius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //double to getArea
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //double to getPerimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //override to get super and radius
    @Override
    public String toString() {
        return super.toString() + ", radius " + this.radius;
    }
}
