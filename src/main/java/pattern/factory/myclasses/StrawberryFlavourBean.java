package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class StrawberryFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the strawberry flavoured bean!\nWow, this bean is amazing!");
    }
}