package pattern.factory.myclasses;

import pattern.factory.myinterface.Bean;

public class ChocolateFlavourBean implements Bean {
@Override
public void taste() {
        System.out.println("You got the chocolate flavoured bean!\nIt’s really good!");
        }
        }
