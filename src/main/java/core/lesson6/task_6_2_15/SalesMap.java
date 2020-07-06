package core.lesson6.task_6_2_15;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesMap {

//    Магазину нужно сохранять информацию о продажах для каждого сотрудника. Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:
//    Алексей 3000
//    Дмитрий 9000
//    Антон 3000
//    Алексей 7000
//    Антон 8000
//
//    Метод должен получить все строки из Readera и заполнить и вернуть карту где ключом будет имя сотрудника, а значением сумма всех его продаж.
//    Пример ввода:
//
//
//    Алексей 3000
//    Дмитрий 9000
//    Антон 3000
//    Алексей 7000
//    Антон 8000
//    Пример вывода:
//    {Алексей=[10000], Дмитрий=[9000], Антон=[11000]}

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000\n8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.println(getSalesMap(buffReader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salesMap = new LinkedHashMap<>();
        try (Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNextLine()) {
                String name = scanner.next();
                Long sale = scanner.nextLong();
                salesMap.merge(name, sale, (sale1, sale2) -> sale1 + sale2);
//                if (scanner.hasNextLong()) {
//                    Long sale = scanner.nextLong();
//                    if (salesMap.containsKey(name)) {
//                        sale += salesMap.get(name);
//                    }
//                    salesMap.put(name, sale);
//                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return salesMap;
    }


}
