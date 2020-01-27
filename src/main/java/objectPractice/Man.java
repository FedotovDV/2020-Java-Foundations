package objectPractice;

import java.util.Objects;

public class Man {
    private String name;
    private double age;
    private double haight;
    private double weight;
    private String telephone;

    public Man(String name, double age, double haight, double weight, String telephone) {
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
        Man man = (Man) o;
        return Double.compare(man.age, age) == 0 &&
                Double.compare(man.haight, haight) == 0 &&
                Double.compare(man.weight, weight) == 0 &&
                Objects.equals(name, man.name) &&
                Objects.equals(telephone, man.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, haight, weight, telephone);
    }
}
