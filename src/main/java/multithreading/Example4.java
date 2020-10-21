package multithreading;

public class Example4 {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println("PRIVET");
                }
            }
        }).start();

        new Thread(() -> {  for (int i = 1; i <= 1000; i++) {
            System.out.println("privet");
        }  return;}).start();
    }
}
