package pattern.factory;

import pattern.factory.myEnum.BeanType;
import pattern.factory.myinterface.Bean;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        eatRandomBean(beanFactory);

    }

    private static void eatRandomBean(BeanFactory beanFactory) {
        Bean bean = getRandomBean(beanFactory);
        System.out.println("\"Bertie Bott's Every Flavour Beans\n" + " — A Risk With Every Mouthful!\"");
        System.out.println("Harry Potter and the Philosopher's Stone\n" + "Chapter 6");
        System.out.println("\nWhat a surprise! ");
        bean.taste();
    }

    private static Bean getRandomBean(BeanFactory beanFactory) {
        Random random = new Random();
        BeanType beanType = BeanType.values()[random.nextInt(BeanType.values().length)];
        return beanFactory.getBean(beanType);
    }


}
