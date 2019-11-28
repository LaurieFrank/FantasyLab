package rooms;

import mythicals.MythicalCreature;

import java.util.ArrayList;

public class Dungeon {
    private String name;
    private String type;
    private ArrayList<MythicalCreature> enemies;

    public Dungeon(String name, String type){
        this.name = name;
        this.type = type;
        this.enemies = new ArrayList<MythicalCreature>();
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public ArrayList<MythicalCreature> getEnemies() {
        return enemies;
    }
}
