public class Enemy extends Character{

    public Enemy(int hp, int attack, int defence, int luck) {
      getAttributes().put("HP", hp);
      getAttributes().put("Attack", attack);
      getAttributes().put("Defence", defence);
      getAttributes().put("Luck", luck);
    }
}
