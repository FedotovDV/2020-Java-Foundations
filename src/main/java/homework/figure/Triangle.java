package homework.figure;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    private boolean checkTriangle() {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA);
    }

    @Override
    double calcSquare() {
        if (checkTriangle()) {
            return Math.sqrt(calcPerimetr() * (calcPerimetr() - sideA) * (calcPerimetr() - sideB) * (calcPerimetr() - sideC));
        }
        return 0.0;
    }

    @Override
    double calcPerimetr() {
        if (checkTriangle()) {
            return (sideA + sideB + sideC) / 2;
        }
        return 0.0;
    }

    @Override
    public  String toString() {
        if (checkTriangle()) {
            return("Triangle shape created with sides :" + sideA + " : " + sideB + " : " + sideC);
        } else {
            return("\u001B[31mA triangle with sides " + sideA + " : " + sideB + " : " + sideC + " cannot be created!\u001B[0m");
        }

    }
}