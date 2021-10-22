package Problem2;

//public rectangle that extends from shape
public class Rectangle extends Shape{
    protected double width;
    protected double height;

    //public rectangle sets width and Height value
    public Rectangle(double width, double height){
        width = 1.0;
        height = 1.0;
    }

    //public super that gets color, filled, width and height
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    //double to getwidth
    public double getWidth() {
        return this.width;
    }

    //void to setWidth
    public void setWidth(double width) {
        this.width = width;
    }

    //double to getHeight
    public double getHeight() {
        return this.height;
    }

    //void to setHeight
    public void setHeight(double height) {
        this.height = height;
    }
    
    //double to getArea
    public double getArea() {
        return width * height;
    }
    
    //double to getPerimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    //override to get super, width and height
    @Override
    public String toString() {
        return super.toString() + ", Width " + this.width + ", Height " + this.height;
    }
    
}
