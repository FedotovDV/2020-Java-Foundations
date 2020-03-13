package pattern.factory;

import pattern.factory.myEnum.BeanType;
import pattern.factory.myclasses.*;
import pattern.factory.myinterface.Bean;

public class BeanFactory {

    public Bean getBean(BeanType beanType) {
        Bean youBean = null;
        switch (beanType) {
            case APPLE:
                youBean = new AppleFlavourBean();
                break;
            case CHOCOLATE:
                youBean = new ChocolateFlavourBean();
                break;
            case GRASS:
                youBean = new GrassFlavourBean();
                break;
            case LIVER:
                youBean = new LiverFlavourBean();
                break;
            case SOAP:
                youBean = new SoapFlavourBean();
                break;
            case SOCK:
                youBean = new SockFlavourBean();
                break;
            case SPINACH:
                youBean = new SpinachFlavourBean();
                break;
            case SPROUTS:
                youBean = new SproutsFlavourBean();
                break;
            case STRAWBERRY:
                youBean = new StrawberryFlavourBean();
                break;
//            default:
//                new IllegalArgumentException();
        }
        return youBean;

    }
}
