//6510405601 Teerut Srithongdee
package models;

import interfaces.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> ducks = new ArrayList<>();
    Quackable leader;

    public void add(Quackable duck) {
        if (leader == null) {
            leader = duck;
        }
        ducks.add(duck);
    }

    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            if (duck == leader) {
                duck.quack();
                duck.quack();
                duck.quack();
            } else {
                duck.quack();
            }
        }
    }
}
