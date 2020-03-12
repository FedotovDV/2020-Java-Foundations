package pattern.singleton;

public class SingletonDoubleCheckedLocking {


    private static SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() {
    }

    public static synchronized SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}