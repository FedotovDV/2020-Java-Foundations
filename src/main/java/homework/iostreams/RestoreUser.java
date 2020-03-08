package homework.iostreams;

import java.io.*;

public class RestoreUser {
    public static void main(String[] args) {
//    /HW: 1. Объект класса User (login, password) Проставить transient на password.
// Сериализоавть объект. После десериализовать объект и вывести поля login и password.
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("user.out"))) {
            User user = (User) inputStream.readObject();
            System.out.println("user.toString() = " + user.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
