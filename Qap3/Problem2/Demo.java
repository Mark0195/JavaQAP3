package Problem2;

public class Demo {
    public static void main(String[] args) {
        Shape S = new Shape("Black", true);
        Circle C = new Circle("Green", false, 5.0);
        Circle C1 = new Circle("Red", true, 5.0);
        Rectangle R = new Rectangle("Red", true, 2.0, 3.0);
        Rectangle R1 = new Rectangle("Green", false, 2.0, 3.0);
        Square Sq = new Square("Blue", true, 4.0, 4.0, 4.0);
        Square Sq1 = new Square("Black", true, 4.0, 4.0, 4.0);
        System.out.println(S.toString());
        System.out.println(C.toString());
        System.out.println(("Area " + C.getArea() + " Perimeter " + C.getPerimeter()));
        System.out.println(C1.toString());
        System.out.println(("Area " + C1.getArea() + " Perimeter " + C1.getPerimeter()));
        System.out.println(R.toString());
        System.out.println(("Area " + R.getArea() + " Perimeter " + R.getPerimeter()));
        System.out.println(R1.toString());
        System.out.println(("Area " + R1.getArea() + " Perimeter " + R1.getPerimeter()));
        System.out.println(Sq.toString());
        System.out.println(("Area " + Sq.getArea() + " Perimeter " + Sq.getPerimeter()));
        System.out.println(Sq1.toString());
        System.out.println(("Area " + Sq1.getArea() + " Perimeter " + Sq1.getPerimeter()));
    }
}
