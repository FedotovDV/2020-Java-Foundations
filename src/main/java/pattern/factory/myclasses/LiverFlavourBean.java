package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class LiverFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the liver flavoured bean!");
    }
}
