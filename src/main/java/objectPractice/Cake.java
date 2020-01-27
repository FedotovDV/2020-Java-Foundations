package objectPractice;

public class Cake {
    private String name;
    private double weight;
    private boolean isSweet;

    public Cake(String name, double weight, boolean isSweet) {
        this.name = name;
        this.weight = weight;
        this.isSweet = isSweet;
    }

    public Cake(String name, double weight) {
        this(name,weight,true);
    }

    public Cake(String name) {
        this(name,1,true);
    }

    public Cake() {
        this(" ",1,true);
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    @Override
    public String toString() {
        return "Торт{" +
                "название: '" + name  +
                "', вес: " + weight + " кг., "+
                (isSweet?"сладкий":"несладкий")+
                '}';
    }
}
