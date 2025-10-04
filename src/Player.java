import java.util.HashMap;

public class Player {
    String playerName;
    Classes playerClass;
    HashMap<String, Integer> playerAttributes = new HashMap<>();

    public Player(String playerName) {
        this.playerName = playerName;
		}

    public void classSelection(int classNumber){
        switch (classNumber) {
          case 1 -> {
              this.playerClass = Classes.WARRIOR;
              playerAttributes.put("HP", 10);
              playerAttributes.put("Attack", 1);
              playerAttributes.put("Defence", 3);
              playerAttributes.put("Luck", 2);
            }
          case 2 -> {
              this.playerClass = Classes.ARCHER;
              playerAttributes.put("HP", 10);
              playerAttributes.put("Attack", 3);
              playerAttributes.put("Attack", 2);
              playerAttributes.put("Attack", 1);
            }
          case 3 -> {
              this.playerClass = Classes.MAGE;
              playerAttributes.put("HP", 10);
              playerAttributes.put("Attack", 2);
              playerAttributes.put("Attack", 1);
              playerAttributes.put("Attack", 3);
            }
          default -> throw new AssertionError();
      	}
    }
}
  
