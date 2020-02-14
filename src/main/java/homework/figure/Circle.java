package homework.figure;

public class Circle extends Figure {

    public static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calcSquare() {
        return Math.round(PI*Math.pow(radius,2));
    }

    @Override
    double calcPerimetr() {
        return Math.round(2*PI*radius);
    }
    @Override
    public  String toString() {
        return("Сircle shape created with radius :" + radius);
    }
}
