package equipment;

public enum Weapons {
    SWORD(3),
    BOW(2),
    AXE(4),
    DAGGER(1);

    private final int damage;

    Weapons(int damage){
        this.damage = damage;
    }

    public int getWeaponDamage(){
        return damage;
    }


}
