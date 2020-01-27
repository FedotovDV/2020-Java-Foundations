package homework.figure;

public class Circle extends Figure {

    public static final double PI = 3.14;
 //   private String figureDescription = "This figure is a circle.";
    double radius;

    public Circle(double radius) {
        this.radius = radius;
//        System.out.println("Сircle shape created with radius :" + radius);
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
    public void toStringFigureDescription() {
        System.out.println("Сircle shape created with radius :" + radius);
    }
}
