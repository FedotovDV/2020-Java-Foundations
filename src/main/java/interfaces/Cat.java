package interfaces;

public class Cat implements Talkable, Swimable, Cloneable, Comparable<Cat> {

    private String name;
    private String breed;
    private double weight;


    private Cat(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public Cat(String name, String breed) {
        this(name, breed, 1);
    }

    public Cat() {
        System.out.println("class Cat new cat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void talk() {
        System.out.println("class Cat implements Talkable: Meom");
    }

    @Override
    public void print() {
        System.out.println(" class Cat implements Talkable print Cat");
        Talkable.super.print();
        Swimable.someStaticAble();
        Talkable.someStaticAble();
    }

    @Override
    public void printSwim() {
        if (swim()) System.out.println("class Cat implements Swimable: I am swim");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return new Cat(name, breed, weight);
    }

    @Override
    public int compareTo(Cat o) {
        return (int) (weight - o.weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name is '" + name + '\'' +
                ", breed:'" + breed + '\'' +
                ", weight= " + weight + "kg }";
    }


}
