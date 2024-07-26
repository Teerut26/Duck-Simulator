//6510405601 Teerut Srithongdee
package adapters;

import interfaces.Quackable;
import models.Pigeon;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
