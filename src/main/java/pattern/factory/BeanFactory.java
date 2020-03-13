package pattern.factory;

import pattern.factory.myEnum.BeanType;
import pattern.factory.myclasses.*;
import pattern.factory.myinterface.Bean;

import java.util.*;

public class BeanFactory {

    static Map<BeanType, Bean> beanTypeMap = new HashMap<>();
    static {
        beanTypeMap.put(BeanType.APPLE, new AppleFlavourBean());
        beanTypeMap.put(BeanType.CHOCOLATE, new ChocolateFlavourBean());
        beanTypeMap.put(BeanType.GRASS, new GrassFlavourBean());
        beanTypeMap.put(BeanType.LIVER, new LiverFlavourBean());
        beanTypeMap.put(BeanType.SOAP, new SoapFlavourBean());
        beanTypeMap.put(BeanType.SOCK, new SockFlavourBean());
        beanTypeMap.put(BeanType.SPINACH, new SpinachFlavourBean());
        beanTypeMap.put(BeanType.SPROUTS, new SproutsFlavourBean());
        beanTypeMap.put(BeanType.STRAWBERRY, new StrawberryFlavourBean());

    }

    public Bean getBean(BeanType beanType) {

        switch (beanType) {
            case APPLE:
                return new AppleFlavourBean();
            case CHOCOLATE:
                return new ChocolateFlavourBean();
            case GRASS:
                return new GrassFlavourBean();
            case LIVER:
                return new LiverFlavourBean();
            case SOAP:
                return new SoapFlavourBean();
            case SOCK:
                return new SockFlavourBean();
            case SPINACH:
                return new SpinachFlavourBean();
            case SPROUTS:
                return new SproutsFlavourBean();
            case STRAWBERRY:
                return new StrawberryFlavourBean();
            default:
                new IllegalArgumentException();
        }
        return null;

    }
}
