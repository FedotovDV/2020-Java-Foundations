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
        System.out.println("What a surprise! ");
        bean.taste();
    }

    private static Bean getRandomBean(BeanFactory beanFactory) {
        Random random = new Random();
        BeanType beanType = BeanType.values()[random.nextInt(BeanType.values().length)];
        return beanFactory.getBean(beanType);
    }


}
