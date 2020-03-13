package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class GrassFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the grass flavoured bean!");
    }
}