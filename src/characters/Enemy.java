package characters;
public class Enemy extends Character{

    public Enemy(String name, int hp, int attack, int defence, int luck) {
      super(name);
      getAttributes().put("HP", hp);
      getAttributes().put("Attack", attack);
      getAttributes().put("Defence", defence);
      getAttributes().put("Luck", luck);
    }
}
