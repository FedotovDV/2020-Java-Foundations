package interfaces;

public class Cat implements Talkable, Swimable{

    @Override
    public void talk() {
        System.out.println("Meom");
    }

    @Override
    public void print() {
        System.out.println("Cat");
        Talkable.super.print();
        Swimable.someStaticAble();
        Talkable.someStaticAble();
    }


    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public void printSwim() {
        if(swim()) System.out.println("I am swim");


    }
}
