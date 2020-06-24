package core.lesson4;

public class ExceptionRunner {

//    Создайте новое проверяемое исключение MyNewException, и создайте метод testExp(), который выбрасывает MyNewException при вызове.
//    Требования:
//            1. Метод testExp() должен быть публичным и иметь тип возвращаемого значения void.
//            2. Класс исключения должен иметь модификатор доступа по умолчанию.
//            3. Метод testExp() расположите вне класса исключения.

    public static void main(String[] args) throws MyNewException {
        ExceptionRunner exceptionRunner = new ExceptionRunner();
        exceptionRunner.testExp();
    }

    //Реализуй метод и исключение здесь
    public void testExp() throws MyNewException {
        throw new MyNewException();
    }


    class MyNewException extends Exception {
        public MyNewException() {
        }
    }
}
