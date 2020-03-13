package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class SockFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the dirty sock flavoured bean!");
    }
}
