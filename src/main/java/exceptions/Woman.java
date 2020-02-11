package exceptions;

public class Woman {
    private String name;
    private double weight;

    public Woman(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        if(weight<=20 || weight>50){
            throw new MyNewRuntimeException("Wrong weight!");
        }
        this.weight = weight;
    }
}
