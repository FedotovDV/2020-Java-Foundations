package iostreams;

import java.io.*;


public class PersistentAnimation implements Serializable, Runnable {
    transient private Thread animator;
    private int animationSpeed;

    public PersistentAnimation(int animationSpeed) {
        this.animationSpeed = animationSpeed;
        startAnimation();
    }

    public void run() {
        while (true) {
            // do animation here
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // наш "псевдо-конструктор"
        in.defaultReadObject();
        // теперь мы вновь получили "живой" объект, поэтому давайте перестроим и запустим его
        startAnimation();

    }

    private void startAnimation() {
        animator = new Thread(this);
        animator.start();
    }
}