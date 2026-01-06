package dataholder;
public enum PlayerClass {

  //Class ID, HP, Attack, Defence, Luck
  WARRIOR(1, 10, 1, 3, 2), 
  ARCHER(2, 10, 3, 2, 1), 
  MAGE(3, 10, 2, 1, 3);

  private final int id, hp, attack, defence, luck;
  
  PlayerClass(int id, int hp, int attack, int defence, int luck) {
    this.id = id;
    this.hp = hp;
    this.attack = attack;
    this.defence = defence;
    this.luck = luck;
  }


  public static PlayerClass fromID(int id) {
    for (PlayerClass c : values()) {
      if (c.getClassID() == id) 
      return c;
    }
    throw new IllegalArgumentException("Invalid class id: " + id);
  }
  
  public int getClassID() { return id; }
  public int getClassHP() { return hp; }
  public int getClassAttack() { return attack; }
  public int getClassDefence() { return defence; }
  public int getClassLuck() { return luck; }
}
