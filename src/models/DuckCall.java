//6510405601 Teerut Srithongdee
package models;

import interfaces.Quackable;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}
