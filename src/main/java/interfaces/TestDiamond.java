package interfaces;

class DiamondTest {

    public static void main(String[] args) {
            D d = new D();
            d.m();

        OtherClass.Inner inner = new OtherClass.Inner();
        inner.m();
    }
}


interface A {
    default void m(){
        System.out.println("Interface A");
    }
}

interface B extends A {
    default void m(){
        System.out.println("Interface B");
    }
}

interface C extends A {
    default void m(){
        System.out.println("Interface C");
    }
}
class D implements B, C {

    @Override
    public void m() {
        C.super.m();
        B.super.m();
    }
}


class AnyClass{
    public void m(){
        System.out.println("AnyClass");
    }
}


class OtherClass{
    public void m(){
        System.out.println("OtherClass");
    }
    public static class Inner extends AnyClass{

    }
}