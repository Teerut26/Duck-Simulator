//6510405601 Teerut Srithongdee
package factories;

import abstracts.AbstractDuckFactory;
import interfaces.Quackable;
import models.DuckCall;
import models.MallardDuck;
import models.RedheadDuck;
import models.RubberDuck;

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
}
