package core.lesson7.task_7_2_12;

//        Пример ввода  1:
//        Мама МАМА мыла-Мыла-мыла Мама  33 раму!
//        Пример ввода 2:
//        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.


import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingString {

    public static void main(String[] args) {


        Charset charset = Charset.forName("UTF-8");
        String text = "Lorem ipsum dolor sit amet, "
                + "consectetur 32 adipiscing elit.\n "
                + "МамЁ МАМё мыла-Мыла-мыла МамЁ  33 раму!"
                + "Sed sodales consectetur purus at faucibus."
                + " Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. \n"
                + "Мама МАМё мыла-Мыла-мыла Мамё  33 раму!"
                + "Morbi lacinia velit blandit 32 tincidunt 32 efficitur. "
                + "Vestibulum eget metus imperdiet sapien laoreet faucibus. "
                + "Мама МАМА мыла-Мыла-мыла Мама  33 раму!"
                + "Nunc eget vehicula mauris, ac auctor lorem. 32 Lorem ipsum dolor sit amet,"
                + " consectetur adipiscing elit. Integer vel odio 32 nec mi tempor dignissim.";
        ByteArrayInputStream textInput = new ByteArrayInputStream(text.getBytes());
        System.setIn(textInput);
        countOfWords(System.in, charset);


    }

    private static void countOfWords(InputStream in, Charset charset) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(in, charset))) {
//                [\\D&&\\W] [\\s\\p{Punct}]+

//        try (BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in, "UTF-8"))) {
//            Integer count = 1;
//                    .filter(s -> !s.equals(""))
            Map<String, Integer> map = reader.lines()
                    .flatMap(s -> Stream.of(s.split("[\\s\\p{Punct}]+")))
                    .map(String::toLowerCase)
                    .collect(Collectors.toMap(k1 -> k1,
                            v1 -> 1,
                            (v1, v2) -> v1 + v2));

            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                            .thenComparing(Map.Entry::getKey))
                    .limit(10)
                    .map(Map.Entry::getKey)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

