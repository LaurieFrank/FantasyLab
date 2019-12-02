package equipment;

public enum Weapons {
    SWORD(4),
    BOW(3),
    AXE(5),
    DAGGER(2),
    NONE(1);

    private final int damage;

    Weapons(int damage){
        this.damage = damage;
    }

    public int getWeaponDamage(){
        return damage;
    }


}
