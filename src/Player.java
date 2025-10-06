import java.util.HashMap;

public class Player {
    private final String playerName;
    private CharacterClass playerClass;
    private HashMap<String, Integer> Attributes = new HashMap<>();

    public Player(String playerName) {
        this.playerName = playerName;
		}

    public void setClass(int classNumber){
        this.playerClass = CharacterClass.fromID(classNumber);
        Attributes.put("HP", playerClass.getHP());
        Attributes.put("Attack", playerClass.getAttack());
        Attributes.put("Defence", playerClass.getDefence());
        Attributes.put("Luck", playerClass.getLuck());
    }
  
  public String getName(){return playerName;}
  public CharacterClass getPlayerClass(){return playerClass; }
}
  
