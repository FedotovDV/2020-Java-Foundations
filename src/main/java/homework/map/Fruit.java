package homework.map;

import java.util.Objects;

public class Fruit {

    private String name;
    private int waith;

    public Fruit(String name, int waith) {
        this.name = name;
        this.waith = waith;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaith() {
        return waith;
    }

    public void setWaith(int waith) {
        this.waith = waith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return getWaith() == fruit.getWaith() &&
                getName().equals(fruit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWaith());
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", waith=" + waith +
                '}';
    }
}
