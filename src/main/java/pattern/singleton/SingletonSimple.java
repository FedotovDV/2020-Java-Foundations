package pattern.singleton;

public class SingletonSimple {

    private static SingletonSimple instance;

    private SingletonSimple() {
    }

    public static SingletonSimple getInstance() {
        if (instance == null) {
            instance = new SingletonSimple();
        }
        return instance;
    }

}
