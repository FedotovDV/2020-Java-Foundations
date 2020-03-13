package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class SproutsFlavourBean implements Bean {
    @Override
    public void taste() {
        System.out.println("You got the sprouts flavoured bean!\n\"Bleaaargh -- see? Sprouts.\""  );
    }
}