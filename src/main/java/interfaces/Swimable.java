package interfaces;

public interface Swimable {
    boolean swim();

    void printSwim();

    default void print() {
        System.out.println("interface Swimable");
    }

    static void someStaticAble() {
        System.out.println("interface Static Swimable");
    }

}
