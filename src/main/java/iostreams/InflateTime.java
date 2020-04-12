package iostreams;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

public class InflateTime {
    public static void main(String[] args) {
        String filename = "anime.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        PersistentTime time = null;
        FileInputStream fis;
        ObjectInputStream in;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            time = (PersistentTime) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        // распечатать восстановленное время
        if (time != null) {
            System.out.println("Время восстановления: " + time.getTime());
        }
        System.out.println();
        // распечатать текущее время
        System.out.println("Текущее время: " + Calendar.getInstance().getTime());
    }
}