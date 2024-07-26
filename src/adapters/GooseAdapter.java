//6510405601 Teerut Srithongdee
package adapters;

import interfaces.Quackable;
import models.Goose;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }
}
