package people;

public class Knight extends Person {
    public Knight(String name, int strength, int hp) {
        super(name, strength, hp);
        this.canFight = true;
    }
}
