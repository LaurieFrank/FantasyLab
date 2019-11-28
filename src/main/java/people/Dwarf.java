package people;

public class Dwarf extends Person{

    public Dwarf(String name, int strength, int hp) {
        super(name, strength, hp);
        this.canFight = true;
    }
}
