//6510405601 Teerut Srithongdee
package factories;

import abstracts.AbstractDuckFactory;
import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import interfaces.Quackable;
import models.*;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
