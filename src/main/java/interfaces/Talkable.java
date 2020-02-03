package interfaces;

public interface Talkable {
    void talk();
    default void print(){
        System.out.println("Talkable");
    }
    static void someStaticAble(){
        System.out.println("Static Talkable");
    }
}
