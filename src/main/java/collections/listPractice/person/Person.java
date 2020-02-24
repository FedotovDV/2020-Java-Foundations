package collections.listPractice.person;

import exceptions.WrongAgeException;
import homework.interfaces.Learnable;

import java.util.Objects;

public class Person implements Learnable {

    private String name;
    private int age;
    private EnumGender gender;

    public Person(String name, int age, EnumGender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException();
        }
        this.age = age;
    }

    public EnumGender getGender() {
        return gender;
    }

    public void setGender(EnumGender gender) {
        this.gender = gender;
    }

    @Override
    public void learn() {
        System.out.println("I can learn!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getName().equals(person.getName()) &&
                getGender() == person.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name is:'" + name +
                '\'' + ", " + age +
                " age, gender: "
                + (gender==EnumGender.MALE? "male":"female") + '}';
    }
}
