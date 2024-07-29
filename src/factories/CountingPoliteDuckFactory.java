//6510405601 Teerut Srithongdee
package factories;

import abstracts.AbstractDuckFactory;
import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import interfaces.Quackable;
import models.*;

public class CountingPoliteDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new PoliteQuack(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new PoliteQuack(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteQuack(new QuackCounter(new RubberDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteQuack(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createPigeon() {
        return new PoliteQuack(new PigeonAdapter(new Pigeon()));
    }

    @Override
    public Quackable createGoose() {
        return new PoliteQuack(new GooseAdapter(new Goose()));
    }
}
