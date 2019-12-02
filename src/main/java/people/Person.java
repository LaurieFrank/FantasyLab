package people;

import equipment.Armour;
import equipment.Inventory;
import equipment.Weapons;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int strength;
    protected int hp;
    protected boolean isMagical;
    protected boolean canFight;
    protected boolean canHeal;
    protected Inventory inventory;


    public Person(String name, int strength, int hp, Inventory inventory){
        this.name = name;
        this.strength = strength;
        this.hp = hp;
        this.isMagical = false;
        this.canFight = false;
        this.canHeal = false;
        this.inventory = inventory;

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

    public boolean canFight(){
        return canFight;
    }

    public boolean canHeal(){
        return canHeal;
    }

    public boolean isMagical(){
        return isMagical;
    }

    public Inventory getInventory(){
        return this.inventory;
    }


}
