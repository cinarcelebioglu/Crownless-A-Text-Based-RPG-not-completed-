

public class Player extends Character {
    private PlayerClass playerClass;

    public Player(String name) {
        this.name = name;
		}

    public void setClass(int classNumber){
        this.playerClass = PlayerClass.fromID(classNumber);
        getAttributes().put("HP", playerClass.getClassHP());
        getAttributes().put("Attack", playerClass.getClassAttack());
        getAttributes().put("Defence", playerClass.getClassDefence());
        getAttributes().put("Luck", playerClass.getClassLuck());

    }
  
  public PlayerClass getPlayerClass(){return playerClass; }

}
  
