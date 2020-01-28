package homework.figure;

public class Rectangl extends Figure {

    private double length;
    private double width;

    public Rectangl(double length, double width) {
        this.length = length;
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
