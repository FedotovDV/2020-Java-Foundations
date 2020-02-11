package interfaces;

public class SuperCow implements Cloneable, Comparable<SuperCow> {
    private double power;
    private String name;

    private SuperCow(String name, double power) {
        this.name = name;
        this.power = power;
    }

    public SuperCow() {
        this("Marusya", 100);
    }

    public void print() {
        System.out.println("SuperCow");
    }

    @Override
    protected SuperCow clone() throws CloneNotSupportedException {
        return new SuperCow(name, power);
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "SuperCow{" + "name is'" + name + '\'' +
                "and power=" + power + '\'' + '}';
    }

    @Override
    public int compareTo(SuperCow o) {
        return (int) (power - o.power);
    }
}
