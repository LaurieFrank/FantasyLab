package people;

public class Cleric extends Person {
    public Cleric(String name, int strength, int hp) {
        super(name, strength, hp);
        this.canFight = true;
        this.canHeal = true;
    }
}
