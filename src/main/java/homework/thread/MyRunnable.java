package homework.thread;

public class MyRunnable implements Runnable {
    private String outputMessage;
    private long millis;

    public MyRunnable(String outputMessage,long millis) {
        this.outputMessage = outputMessage;
        this.millis = millis;
    }

    public MyRunnable (String outputMessage) {
        this(outputMessage, 5000);
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int random = 30+(int)(Math.random()*10);
            String color = "\u001B["+ random +"m";
            System.out.println(outputMessage+color);
        }
    }

}
