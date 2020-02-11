package exceptions;

import interfaces.Cat;

public class ExceptionRuner {
    public static void main(String[] args) {
//
//        Cat cat = new Cat();
//        cat = null;
//        cat.toString();
//        throw new ExceptionInInitializerError();

        Man alexandr = new Man("Alexandr", 10);
        try {
            alexandr.setAge(-5);
        } catch(MyNewException exc){
            System.err.println("Bad age ");
            exc.getMessage();
            exc.printStackTrace();
        } finally{
            System.out.println("Finally 1st try");
        }

        Woman mariya = new Woman("Mariya", 30);
        try{
            mariya.setWeight(105);
        } catch(MyNewRuntimeException re){
            re.printStackTrace();
        }
    }


}
