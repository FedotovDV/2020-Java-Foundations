package core.lesson4;

public class CarDriving {


//    Создайте статический класс Car, чтобы объекты этого типа можно было использовать в try-with-resources.
//            Метод close() должен выводить на экран фразу "Машина закрывается...".
//    Try должен ловить все непроверяемые исключения и игнорировать их.
//    В методе main в блоке try вызови метод drive(). Метод drive должен выводить на экран сообщение "Машина поехала."
//    Требования:
//            1. Решение должно содержать статический класс Car.
//            2. Решение должно содержать метод main.
//    3. В решение должен использоваться try с ресурсами.



    public static void main(String... args) throws Exception {
        try(Car car = new Car()){
            car.drive();
        }catch (RuntimeException ignored){

        }
    }

    public static class Car implements AutoCloseable{

        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }
        public void drive(){
            System.out.println("Машина поехала.");
        }

    }
}


