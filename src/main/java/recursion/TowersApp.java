package recursion;
/*
from
Роберт Лафорте Структуры данных и адгоритмы
Решение головоломки "Ханойская башня"
*/
public class TowersApp {

    static int numberDisks = 5;

    public static void main(String[] args) {
        doTowers( numberDisks, 'A', 'B', 'C');

    }

    private static void doTowers(int topDisk, char from, char inter, char to) {

        if(topDisk == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowers( topDisk-1, from, to, inter );
            System.out.println("Disk "+ topDisk+ " from " + from + " to " + to);
            doTowers( topDisk-1, inter, from, to);
        }

    }


}
