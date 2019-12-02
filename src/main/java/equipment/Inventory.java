package equipment;

public class Inventory {
    private Armour armour;
    private Magic magic;
    private Weapons weapon;
    private Heal heal;

    public Inventory(Armour armour, Magic magic, Weapons weapon, Heal heal){
        this.armour = armour;
        this.magic = magic;
        this.weapon = weapon;
        this.heal = heal;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

    public Armour getArmour(){
        return this.armour;
    }

    public Magic getMagic(){
        return this.magic;
    }

    public Heal getHealing(){ return this.heal; }

    public int getWeaponDamage(){
        return this.weapon.getWeaponDamage();
    }

    public int getArmourProtection(){
        return this.armour.getProtection();
    }

    public int getMagicDamage(){
        return this.magic.getMagicDamage();
    }

    public int getHealingAmount(){ return this.heal.getHealingAmount();}
}
