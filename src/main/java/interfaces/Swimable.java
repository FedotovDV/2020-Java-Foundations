package interfaces;

public interface Swimable {
    boolean swim();
    void printSwim();
    default void print(){
        System.out.println("Swimable");
    }
    static void someStaticAble(){
        System.out.println("Static Swimable");
    }

}
