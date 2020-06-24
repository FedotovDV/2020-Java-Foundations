package core.lesson4;

public class PrintStackTrace {

    public static void main(String args[]) {
        try {
            a();
        } catch(HighLevelException e) {
            StackTraceElement[] stktrace = e.getStackTrace();
            for (int i = stktrace.length-1; i >=0; i--) {
                System.out.println("Index " + i + " of stack trace"
                        + " array conatins = " + stktrace[i].toString());
            }
        }



    }
    static void a() throws HighLevelException {
        try {
            b();
        } catch(MidLevelException e) {
            throw new HighLevelException(e);
        }
    }
    static void b() throws MidLevelException {
        c();
    }
    static void c() throws MidLevelException {
        try {
            d();
        } catch(LowLevelException e) {
            throw new MidLevelException(e);
        }
    }
    static void d() throws LowLevelException {
        e();
    }
    static void e() throws LowLevelException {
        throw new LowLevelException();
    }
}

class HighLevelException extends Exception {
    HighLevelException(Throwable cause) { super(cause); }
}

class MidLevelException extends Exception {
    MidLevelException(Throwable cause)  { super(cause); }
}

class LowLevelException extends Exception {
}

