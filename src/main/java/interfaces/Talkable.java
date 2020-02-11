package interfaces;

public interface Talkable {
    void talk();

    default void print() {
        System.out.println("interface Talkable");
    }

    static void someStaticAble() {
        System.out.println("interface Static Talkable");
    }
}
