//6510405601 Teerut Srithongdee
package models;

import interfaces.Quackable;

public class PoliteQuack implements Quackable {
    Quackable duck;
    String politeEnding = "kub";

    public PoliteQuack(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        System.out.print(politeEnding);
    }
}
