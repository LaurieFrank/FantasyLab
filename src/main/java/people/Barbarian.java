package people;

public class Barbarian extends Person{

    public Barbarian(String name, int strength, int hp) {
        super(name, strength, hp);
        this.canFight = true;
    }
}
