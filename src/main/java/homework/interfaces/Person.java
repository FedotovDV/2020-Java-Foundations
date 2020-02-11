package homework.interfaces;

public class Person implements Learnable {
    @Override
    public void learn() {
        System.out.println("I can learn!");
    }
}
