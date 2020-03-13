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
        return beanTypeMap.get(beanType);
    }

//
//    public Bean getBean(BeanType beanType) {
//        Bean youBean = null;
//        switch (beanType) {
//            case APPLE:
//                youBean = new AppleFlavourBean();
//                break;
//            case CHOCOLATE:
//                youBean = new ChocolateFlavourBean();
//                break;
//            case GRASS:
//                youBean = new GrassFlavourBean();
//                break;
//            case LIVER:
//                youBean = new LiverFlavourBean();
//                break;
//            case SOAP:
//                youBean = new SoapFlavourBean();
//                break;
//            case SOCK:
//                youBean = new SockFlavourBean();
//                break;
//            case SPINACH:
//                youBean = new SpinachFlavourBean();
//                break;
//            case SPROUTS:
//                youBean = new SproutsFlavourBean();
//                break;
//            case STRAWBERRY:
//                youBean = new StrawberryFlavourBean();
//                break;
////            default:
////                new IllegalArgumentException();
//        }
//        return youBean;
//
//    }
}
