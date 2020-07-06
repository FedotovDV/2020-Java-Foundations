package core.lesson6.task_6_2_14;

import com.sun.xml.internal.ws.util.StreamUtils;
import org.apache.logging.log4j.core.util.ArrayUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;

public class ReversRunner {

//    Напишите программу, которая прочитает из System.in последовательность целых чисел,
//    разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях,
//    и затем выведет получившуюся последовательность в обратном порядке в System.out.
//
//    Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
//
//            Все import объявлены за вас.
//    Пример ввода: 1 2 3 4 5 6 7 8 9 10
//    Пример вывода: 10 8 6 4 2


    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        Deque<Integer> integerQueue = new ArrayDeque<>();
        try (Scanner scanner = new Scanner(System.in)) {

            while (scanner.hasNext()) {
                integerQueue.add(scanner.nextInt());
                count++;
            }
        }
        Iterator reverse = integerQueue.descendingIterator();
        while (reverse.hasNext()) {
            Integer element = (Integer) reverse.next();
            if ((count--) % 2 == 0)
                System.out.print(element);
            if (reverse.hasNext()) {
                System.out.print(" ");
            }
            reverse.remove();
        }
    }
}
