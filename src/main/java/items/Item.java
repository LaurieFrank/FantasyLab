package items;

public enum Item {
    POTION(1000),
    HERB(100);

    private int healing;

    Item(int healing){
        this.healing = healing;
    }
}
