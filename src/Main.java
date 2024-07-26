//6510405601 Teerut Srithongdee
import factories.CountingDuckFactory;
import factories.CountingPoliteDuckFactory;
import factories.DuckFactory;
import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("### Duck Simulator - No Decorators ###");
        DuckSimulator simulator1 = new DuckSimulator(new DuckFactory());
        simulator1.simulate();

        System.out.println("\n### Duck Simulator - Counting Decorators ###");
        DuckSimulator simulator2 = new DuckSimulator(new CountingDuckFactory());
        simulator2.simulate();

        System.out.println("\n### Duck Simulator - Counting & Polite Decorators ###");
        DuckSimulator simulator3 = new DuckSimulator(new CountingPoliteDuckFactory());
        simulator3.simulate();

        System.out.println("\n### Duck Simulator - Flock with Leader ###");
        Flock flock = new Flock();
        flock.add(new QuackCounter(new MallardDuck())); // Leader
        flock.add(new QuackCounter(new RedheadDuck()));
        flock.add(new QuackCounter(new RubberDuck()));
        flock.add(new QuackCounter(new DuckCall()));
        flock.quack();
        System.out.println("Number of Quacks: " + QuackCounter.getQuacks());
    }
}
