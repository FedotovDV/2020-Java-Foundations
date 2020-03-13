package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class AppleFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the apple flavoured bean!");
    }
}
