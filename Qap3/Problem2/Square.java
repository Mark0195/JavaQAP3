package Problem2;

//public square that extends from rectangle
public class Square extends Rectangle{
    protected double side;

    //public super to make sides equal
    public Square(double side) {
        super(side, side);
    }

    //public super to get color, filled, width, height, and side
    public Square(String color, boolean filled, double width, double height, double side) {
        super(color, filled, width, height);
        this.side = side;
    }

    //double to getSide
    public double getSide() {
        return this.side;
    }

    //void to setSide
    public void setSide(double side) {
        this.side = side;
    }

    //override to make width equal side
    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    //override to make height equal side
    @Override
    public void setHeight(double side) {
        this.height = side;
    }

    //override to get super and sides
    @Override
    public String toString() {
        return super.toString() + ", sides " + this.side;
    }
}
