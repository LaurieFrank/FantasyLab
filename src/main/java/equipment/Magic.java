package equipment;

public enum Magic {
    FIREBALL(3),
    LIGHTNING(10),
    ICEBLAST(3),
    NONE(1);

    private final int damage;

    Magic(int damage){
        this.damage = damage;
    }

    public int getMagicDamage(){
        return damage;
    }

}
