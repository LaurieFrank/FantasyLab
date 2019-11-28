package people;

public class Warlock extends Person {
    public Warlock(String name, int strength, int hp) {
        super(name, strength, hp);
        this.isMagical = true;
    }
}
