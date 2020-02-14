package homework.figure;

public class Rectangl extends Figure {

    private double length;
    private double width;

    public Rectangl(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcSquare() {
        return length * width;
    }

    @Override
    public double calcPerimetr() {
        return 2 * (length + width);
    }

    @Override
    public  String toString() {
        return("Rectangl shape created with length :" + length + " and width :" + width);
    }

}
