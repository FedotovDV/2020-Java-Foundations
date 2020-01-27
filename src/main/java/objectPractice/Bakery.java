package objectPractice;

public class Bakery {
    public static void main(String[] args) {
        Cake myCake1 = new Cake("Прага", 2);
        Cake myCake2 = new Cake();
        myCake2.setName("Наполеон");
        myCake2.setSweet(false);

        System.out.println(myCake1.toString());
        System.out.println(myCake2.toString());

    }
}
