package homework.iostreams;

import java.io.*;

public class SaveUser {

    public static void main(String[] args) {
//    /HW: 1. Объект класса User (login, password) Проставить transient на password.
// Сериализоавть объект. После десериализовать объект и вывести поля login и password.
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user.out"))) {
            outputStream.writeObject(new User("User", new char[]{'u', 's', 'e', 'r'}));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
