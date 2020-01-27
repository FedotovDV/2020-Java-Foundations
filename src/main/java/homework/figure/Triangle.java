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

    private boolean checkTriangle() {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA)) {
            return true;
        }
        return false;
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
    public void toStringFigureDescription() {
        if (checkTriangle()) {
            System.out.println("Triangle shape created with sides :" + sideA + " : " + sideB + " : " + sideC);
        } else {
            System.out.println("\u001B[31mA triangle with sides " + sideA + " : " + sideB + " : " + sideC + " cannot be created!\u001B[0m");
        }

    }
}