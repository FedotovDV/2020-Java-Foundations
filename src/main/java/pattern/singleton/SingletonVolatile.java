package pattern.singleton;

public class SingletonVolatile {

    private static volatile SingletonVolatile instance;

    private SingletonVolatile() {
    }

    public static synchronized SingletonVolatile getInstance() {
        if (instance == null) {
            synchronized (SingletonVolatile.class) {
                if (instance == null) {
                    instance = new SingletonVolatile();
                }
            }
        }
        return instance;
    }
}
