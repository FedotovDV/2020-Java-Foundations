package homework.figure;


public class FigureRunner {
    public static void main(String[] args) {
        Figure[] figureArray = getFigures();
        printFigure(figureArray);
    }

    private static Figure[] getFigures() {
        Figure rectangl = new Rectangl(4.0, 3.0);
        Figure triangle1 = new Triangle(4.0, 3.0,5.0);
        Figure triangle2 = new Triangle(2.0, 2.0,5.0);
        Figure circle = new Circle(5);
        return new Figure []{rectangl,triangle1,triangle2,circle};
    }

    private static void printFigure(Figure [] figureArray) {
        for (Figure figure:figureArray) {
            System.out.println(figure.toString());
            System.out.println("Square = " + figure.calcSquare());
            System.out.println("Perimetr = " + figure.calcPerimetr());
            System.out.println();
        }
    }
}
