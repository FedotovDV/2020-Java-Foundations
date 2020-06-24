package core.lesson3;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AsciiCharSequenceRunner {

//    Напишите статический класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.
//    Класс AsciiCharSequence должен:
//    реализовывать интерфейс java.lang.CharSequence;
//    иметь конструктор, принимающий массив байт;
//    определять методы length(), charAt(), subSequence() и toString()
//    Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
//    В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence sequence = new AsciiCharSequence(example);
        System.out.println(sequence.toString());
        System.out.println(sequence.length());
        System.out.println(sequence.charAt(4));
        System.out.println(sequence.subSequence(1, 4));
        example[0] = 74;
        System.out.println(sequence.toString());

    }

    public static class AsciiCharSequence implements CharSequence {
        private final byte[] value;

        public AsciiCharSequence(byte[] value) {
            this.value = Arrays.copyOf(value, value.length);
        }

        @Override
        public String toString() {
            return new String(value);
        }

        @Override
        public int length() {
            return value.length;
        }

        @Override
        public char charAt(int index) {
            return (char) value[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return ((start == 0) && (end == value.length)) ? this : new AsciiCharSequence(Arrays.copyOfRange(value, start, end));
        }
    }
}
