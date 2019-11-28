package people;

public abstract class Person {
    private String name;
    private int strength;
    private int hp;
    private boolean isMagical;
    private boolean canFight;
    private boolean canHeal;

    public Person(String name, int strength, int hp){
        this.name = name;
        this.strength = strength;
        this.hp = hp;
        this.isMagical = false;
        this.canFight = false;
        this.canHeal = false;
    }

    public String getName(){
        return name;
    }

    public int getStrength(){
        return strength;
    }

    public int getHp(){
        return hp;
    }
}
