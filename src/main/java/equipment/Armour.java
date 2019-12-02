package equipment;

public enum Armour {
    LIGHT_ARMOUR(2),
    HEAVY_ARMOUR(4),
    SHIELD(3),
    NONE(1);

    private final int protection;

    Armour(int protection){
        this.protection = protection;
    }

    public int getProtection(){
        return protection;
    }

}
