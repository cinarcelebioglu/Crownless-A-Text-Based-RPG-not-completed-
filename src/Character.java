// Common class for both player and enemies

import java.util.HashMap;

public abstract class Character {
    protected String name;
    private HashMap<String, Integer> attributes = new HashMap<>();

    public Character() {}

    public boolean isAlive() {
        return attributes.get("Current HP") > 0;
    }

    public String getName() {return name; }
    public HashMap<String, Integer> getAttributes(){return attributes;}
}