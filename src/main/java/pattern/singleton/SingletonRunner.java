package pattern.singleton;

import static pattern.singleton.SingletonSimple.*;

public class SingletonRunner {
    public static void main(String[] args) {
        System.out.println("\nCreating a Singleton with Enum :");
        SingletonEnum singletonEnum1 = SingletonEnum.getInstance();
        System.out.println("singletonEnum1 = " + singletonEnum1);
        SingletonEnum singletonEnum2 = SingletonEnum.getInstance();
        System.out.println("singletonEnum2 = " + singletonEnum2);


        System.out.println("\nCreating a Singleton with Lazy Initialized :");
        SingletonSimple singletonSimple1 = SingletonSimple.getInstance();
        System.out.println("singletonSimple1 = " + singletonSimple1);
        SingletonSimple singletonSimple2 = SingletonSimple.getInstance();
        System.out.println("singletonSimple2 = " + singletonSimple2);
        System.out.println("(singletonSimple1 == singletonSimple2) = " + (singletonSimple1 == singletonSimple2));

        System.out.println("\nCreating a Singleton with inner class\n (Bill Pugh's “Initialization on Demand Holder” solution). :");
        SingletonBillPugh singletonBillPugh1 = SingletonBillPugh.getInstance();
        System.out.println("singletonBillPugh1 = " + singletonBillPugh1);
        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();
        System.out.println("singletonBillPugh2 = " + singletonBillPugh2);
        System.out.println("(singletonBillPugh1==singletonBillPugh2) = " + (singletonBillPugh1 == singletonBillPugh2));

        System.out.println("\nCreating a Singleton with Synchronized :");
        SingletonSynchronized singletonSynchronized1 = SingletonSynchronized.getInstance();
        System.out.println("singletonSynchronized1 = " + singletonSynchronized1);
        SingletonSynchronized singletonSynchronized2 = SingletonSynchronized.getInstance();
        System.out.println("singletonSynchronized2 = " + singletonSynchronized2);
        System.out.println("(singletonSynchronized1==singletonSynchronized2) = " + (singletonSynchronized1 == singletonSynchronized2));

        System.out.println("\nCreating a Singleton with Double-Checked-Locking :");
        SingletonDoubleCheckedLocking singletonDoubleCheckedLocking1 = SingletonDoubleCheckedLocking.getInstance();
        System.out.println("singletonDoubleCheckedLocking1 = " + singletonDoubleCheckedLocking1);
        SingletonDoubleCheckedLocking singletonDoubleCheckedLocking2 = SingletonDoubleCheckedLocking.getInstance();
        System.out.println("singletonDoubleCheckedLocking2 = " + singletonDoubleCheckedLocking2);
        System.out.println("(singletonDoubleCheckedLocking1==singletonDoubleCheckedLocking2) = " + (singletonDoubleCheckedLocking1 == singletonDoubleCheckedLocking2));


        System.out.println("\nCreating a Singleton with Volatile Double-Checked-Locking :");
        SingletonVolatile singletonVolatile1 = SingletonVolatile.getInstance();
        System.out.println("singletonVolatile1 = " + singletonVolatile1);
        SingletonVolatile singletonVolatile2 = SingletonVolatile.getInstance();
        System.out.println("singletonVolatile2 = " + singletonVolatile2);
        System.out.println("(singletonVolatile1==singletonVolatile2) = " + (singletonVolatile1 == singletonVolatile2));

    }
}
