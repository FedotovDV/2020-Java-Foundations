package pattern.singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {
    }

    private static class SingletonDemandHolder {
        private final static SingletonBillPugh instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonDemandHolder.instance;
    }

}
