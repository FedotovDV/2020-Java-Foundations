package homework.figure;

public abstract class Figure {

    abstract double calcSquare();

    abstract double calcPerimetr();

    @Override
    public String toString() {
        return "Figure";
    }
}
