package mythicals;

public abstract class MythicalCreature {
    private String name;
    private int strength;
    private int hp;
    private double ability;

    public MythicalCreature(String name, int strength, int hp, double ability){
        this.name = name;
        this.strength = strength;
        this.hp = hp;
        this.ability = ability;
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

    public double getAbility(){
        return ability;
    }
}
