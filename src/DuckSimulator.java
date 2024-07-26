//6510405601 Teerut Srithongdee
import abstracts.AbstractDuckFactory;
import interfaces.Quackable;
import models.*;

import java.util.ArrayList;
import java.util.Iterator;

class DuckSimulator {
    ArrayList<Quackable> ducks = new ArrayList<>();

    public DuckSimulator(AbstractDuckFactory duckFactory) {
        ducks.add(duckFactory.createMallardDuck());
        ducks.add(duckFactory.createRedheadDuck());
        ducks.add(duckFactory.createRubberDuck());
        ducks.add(duckFactory.createDuckCall());
    }

    public void simulate() {
        System.out.println("\nDuck Simulator");
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.quack();
        }

        System.out.println("\nNumber of Quacks: " + QuackCounter.getQuacks());
    }
}
