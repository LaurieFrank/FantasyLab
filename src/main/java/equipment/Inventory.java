package equipment;

public class Inventory {
    private Armour armour;
    private Magic magic;
    private Weapons weapon;

    public Inventory(Armour armour, Magic magic, Weapons weapon){
        this.armour = armour;
        this.magic = magic;
        this.weapon = weapon;
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

    public int getWeaponDamage(){
        return this.weapon.getWeaponDamage();
    }

    public int getArmourProtection(){
        return this.armour.getProtection();
    }

    public int getMagicDamage(){
        return this.magic.getMagicDamage();
    }
}
