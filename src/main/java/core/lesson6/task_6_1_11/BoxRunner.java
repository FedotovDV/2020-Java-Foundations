package core.lesson6.task_6_1_11;

public class BoxRunner {

    public static void main(String[] args) {
        Box.getBox();
    }


    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<>();
        }

    }

}
