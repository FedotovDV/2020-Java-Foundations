package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendsAction1 = new ArrayList<>();
        friendsAction1.add(Action.ROCK);
        friendsAction1.add(Action.SCISSORS);
        friendsAction1.add(Action.PAPER);
        List<Action> friendsAction2 = new ArrayList<>();
        friendsAction2.add(Action.PAPER);
        friendsAction2.add(Action.ROCK);
        friendsAction2.add(Action.ROCK);

        new BestFriend("Ivan", friendsAction1, exchanger);
        new BestFriend("Petr", friendsAction2, exchanger);


    }
}


enum Action {
    ROCK,
    PAPER,
    SCISSORS;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void whoWins(Action myAction, Action friendAction) {
        if (( myAction == Action.ROCK && friendAction == Action.SCISSORS)
            ||(myAction == Action.SCISSORS && friendAction == Action.PAPER)
                || (myAction == Action.PAPER && friendAction == Action.ROCK)){
            System.out.println(name + "  WINS!!!");
        }
    }
}