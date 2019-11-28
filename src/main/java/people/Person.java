package people;

import equipment.Inventory;
import equipment.Weapons;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int strength;
    private int hp;
    protected boolean isMagical;
    protected boolean canFight;
    protected boolean canHeal;
    protected ArrayList<Inventory> inventory;

    public Person(String name, int strength, int hp){
        this.name = name;
        this.strength = strength;
        this.hp = hp;
        this.isMagical = false;
        this.canFight = false;
        this.canHeal = false;
        this.inventory = new ArrayList<Inventory>();

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

    public void addItemToInventory(Inventory item){
        inventory.add(item);
    }


}
