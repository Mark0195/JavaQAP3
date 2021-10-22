package Problem2;

//public for shape
public class Shape {
    protected String color;
    protected boolean filled;

    //public shape to set color and filled values
    public Shape(){
        color = "Green";
        filled = true;
    }

    //public shape to set color and filled
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //string to getColor
    public String getColor(){
        return this.color;
    }

    //boolean to getFilled
    public boolean isFilled(){
        return this.filled;
    }

    //void to setColor
    public void setColor(String color){
        this.color = color;
    }

    //void to setFilled
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //string to return color and filled
    public String toString(){
        return " Color: " + this.color + ", Shape: " + this.filled + ", filled out";
    }
}
