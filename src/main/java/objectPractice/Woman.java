package objectPractice;

import java.util.Objects;

public class Woman {

    private String name;
    private double age;
    private double haight;
    private double weight;
    private String telephone;

    public Woman(String name, double age, double height, double weight, String telephone) {
        this.name = name;
        this.age = age;
        this.haight = height;
        this.weight = weight;
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woman woman = (Woman) o;
        if(name == null){
            if(woman.name != null) return false;
        } else {
            if(!name.equals(woman.name)) return false;
        }
        if(age != woman.age) return false;
        if(haight != woman.haight) return false;
        if(weight != woman.weight) return false;
        if(telephone == null){
            return woman.telephone == null;
        } else {
            return telephone.equals(woman.telephone);
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (int)(age + haight + weight);
        result += ((name==null)?0:name.hashCode());
        result += ((telephone==null)?0:telephone.hashCode());
        return result;

    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", haight=" + haight +
                ", weight=" + weight +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
