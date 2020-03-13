package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class SoapFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the soap flavoured bean!\n Ha-ha!");
    }
}
