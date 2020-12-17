package core.lesson1;

public class CharExpression {

    public static void main(String[] args) {
        System.out.println(charExpression(1));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
