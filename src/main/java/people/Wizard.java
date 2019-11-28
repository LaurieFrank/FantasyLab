package people;

public class Wizard extends Person {

    public Wizard(String name, int strength, int hp) {
        super(name, strength, hp);
        this.isMagical = true;
    }
}
