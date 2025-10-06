public enum CharacterClass {

  //Class ID, HP, Attack, Defence, Luck
  WARRIOR(1, 10, 1, 3, 2), 
  ARCHER(2, 10, 3, 2, 1), 
  MAGE(3, 10, 2, 1, 3);

  private final int id, hp, attack, defence, luck;
  
  CharacterClass(int id, int hp, int attack, int defence, int luck) {
    this.id = id;
    this.hp = hp;
    this.attack = attack;
    this.defence = defence;
    this.luck = luck;
  }


  public static CharacterClass fromID(int id) {
    for (CharacterClass c : values()) {
      if (c.getID() == id) 
      return c;
    }
    throw new IllegalArgumentException("Invalid class id: " + id);
  }
  
  public int getID() { return id; }
  public int getHP() { return hp; }
  public int getAttack() { return attack; }
  public int getDefence() { return defence; }
  public int getLuck() { return luck; }
}
