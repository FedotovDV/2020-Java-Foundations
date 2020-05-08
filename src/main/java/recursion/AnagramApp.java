package recursion;

import lombok.extern.log4j.Log4j;

@Log4j
public class AnagramApp {

    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void anagram(String word) {
//        log.info("Entering: word=" + word);
        size = word.length();
        count = 0;
        for (int i = 0; i < size; i++) {
            arrChar[i] = word.charAt(i);
        }
        doAnagram(size);

    }

    private static void doAnagram(int newSize) {
        // Если слово сдишком маленькое, не продолжать
        if (newSize == 1) {
           return;
        }
        // Для каждой позиции построить анаграммы остальных букв
        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize-1);

            // Если внутреннее сострояние - вывести слово
            if (newSize == 2) {
                displayWord();
            }
            // Циклический сдвиг всего слова
            rotate(newSize);
        }
    }

    private static void rotate(int newSize) {
        int i;
        int position = size - newSize;
        // Сохранение первой буквы
        char temp = arrChar[position];
        // Сдвиг остальных букв влево
        for ( i = position + 1; i < size; i++) {
            arrChar[i-1] = arrChar[i];
        }
        // Перемещение первой буквы на правый край
        arrChar[i-1] = temp;
    }

    private static void displayWord() {
        if(count<99){
            System.out.print(" ");
        }
        if(count<9){
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for(int i=0; i<size; i++){
            System.out.print(arrChar[i]);
        }
        System.out.print("   ");
        System.out.flush();
        if(count%6 == 0){
            System.out.println("");
        }
    }
}
