package homework.figure;

import java.util.ArrayList;
//https://gist.github.com/FedotovDV/9696afc2946b74a6122a18a84f8c1ee0
public class FigureRuner {
    public static void main(String[] args) {
        Figure rectangl = new Rectangl(4.0, 3.0);
        Figure triangle1 = new Triangle(4.0, 3.0,5.0);
        Figure triangle2 = new Triangle(2.0, 2.0,5.0);
        Figure circle = new Circle(5);


        ArrayList<Figure> figureArrayList = new ArrayList<>();
        figureArrayList.add(rectangl);
        figureArrayList.add(triangle1);
        figureArrayList.add(triangle2);
        figureArrayList.add(circle);

        for (int i=0; i<figureArrayList.size();i++) {
            figureArrayList.get(i).toStringFigureDescription();
            System.out.println("Square = " + figureArrayList.get(i).calcSquare());
            System.out.println("Perimetr = " + figureArrayList.get(i).calcPerimetr());
            System.out.println();
            System.out.println();
        }

    }
}
