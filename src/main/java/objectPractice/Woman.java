package objectPractice;

import java.util.Objects;

public class Woman {

    private String name;
    private double age;
    private double haight;
    private double weight;
    private String telephone;

    public Woman(String name, double age, double haight, double weight, String telephone) {
        this.name = name;
        this.age = age;
        this.haight = haight;
        this.weight = weight;
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woman woman = (Woman) o;
        return Double.compare(woman.age, age) == 0 &&
                Double.compare(woman.haight, haight) == 0 &&
                Double.compare(woman.weight, weight) == 0 &&
                Objects.equals(name, woman.name) &&
                Objects.equals(telephone, woman.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, haight, weight, telephone);
    }
}
