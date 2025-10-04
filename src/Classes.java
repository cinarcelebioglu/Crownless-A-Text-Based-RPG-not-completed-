public enum Classes {

  WARRIOR(1), ARCHER(2), MAGE(3);

  @SuppressWarnings("unused")
  private final int classNumber;
  
  Classes(int classNumber){
    this.classNumber = classNumber;
  }
}
