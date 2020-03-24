package homework.thread;

import java.util.concurrent.TimeUnit;

public class MyThreads extends Thread{

    private String outputMessage;
    private long millis;

    public MyThreads(String outputMessage,long millis) {
        this.outputMessage = outputMessage;
        this.millis = millis;
    }

    public MyThreads(String outputMessage) {
        this(outputMessage, 2000);
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
//                TimeUnit.SECONDS.sleep(2);
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
