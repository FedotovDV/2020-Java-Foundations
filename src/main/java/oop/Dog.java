package oop;

public class Dog {

    private String name;
    private String breed;
    private boolean isBark;

    public Dog(String name, String breed, boolean isBark) {
        this.name = name;
        this.breed = breed;
        this.isBark = isBark;
    }

    public Dog(String name, String breed) {
        this(name, breed, false);
    }

    public Dog(String name) {
        this.name = name;
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
    public void setBreed(String name) {
        this.name = breed;
    }

    public boolean isBark() {
        return isBark;
    }

    public void setBark(boolean bark) {
        isBark = bark;
    }
}
