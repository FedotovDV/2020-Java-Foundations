package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class SpinachFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the spinach flavoured bean!");
    }
}
