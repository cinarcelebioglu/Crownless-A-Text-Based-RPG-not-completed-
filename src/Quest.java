public class Quest {
  private String objective;
  private String questGiver;

  public Quest(String objective, String questGiver){
    this.objective = objective;
    this.questGiver = questGiver;
  }

  @Override
  public String toString() {return ("Objective= " + objective + " | Quest Giver= " + questGiver);}
}
