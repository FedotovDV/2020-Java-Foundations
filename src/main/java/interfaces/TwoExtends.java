package interfaces;

public interface TwoExtends  extends Swimable, Talkable{
    @Override
    default boolean swim() {
        return false;
    }

    @Override
    default void printSwim() {

    }

    @Override
    default void print() {

    }

    @Override
    default void talk() {

    }
}
