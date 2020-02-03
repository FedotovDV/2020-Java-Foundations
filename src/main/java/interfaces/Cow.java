package interfaces;

public class Cow extends SuperCow implements Talkable {

    @Override
    public void talk() {
        System.out.println("Muuuu");
    }

    @Override
    public void print() {
        Talkable.super.print();
    }

}
