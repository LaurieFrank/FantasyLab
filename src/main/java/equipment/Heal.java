package equipment;

public enum Heal {
    POTION(1000),
    HERB(100),
    NONE(1);

    private int healing;

    Heal(int healing){
        this.healing = healing;
    }

    public int getHealingAmount(){
        return healing;
    }
}