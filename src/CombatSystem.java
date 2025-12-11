
public class CombatSystem {
  
  public static double playerAttacks(int totalAttack, int totalLuck, int opponentsTotalDefence, int decision) {
    
    System.out.println("--ITS YOUR TURN--");
    if (decision == 1 ) {totalAttack++;}
    double luckBonus = Math.random() * totalLuck;
    double damage = totalAttack + luckBonus - opponentsTotalDefence;
    promptDamage(luckBonus, damage, totalAttack, opponentsTotalDefence);
    if (damage > 0) {return damage;}
    else{damage = 0; return damage;}
  }
  
  public static void promptDamage(double luckBonus, double damage, int totalAttack, int opponentsTotalDefence){
    System.out.println("You attacked.");
    System.out.println("Attack Point: " + totalAttack);
    System.out.println("Luck Bonus: " + luckBonus);
    System.out.println("Opponent's Defence: " + opponentsTotalDefence);
    if (damage >=0 ) System.out.println("Total damage: " + damage);
    else System.out.println("Total damage given = 0");
  }
  
  public static double opponentAttacks(int totalDefence, int opponentsLuck, int opponentsAttack, int decision) {
    
    System.out.println("--ITS YOUR OPPONENT'S TURN--");
    if (decision == 2 ) {totalDefence++;}
    double luckBonus = Math.random() * opponentsLuck;
    double damage = opponentsAttack + luckBonus - totalDefence;
    promptDamageTaken(luckBonus, damage, opponentsAttack, totalDefence);
    if (damage > 0) {return damage;}
    else{damage = 0; return damage;}
  }
  
  public static void promptDamageTaken(double luckBonus, double damage, int totalAttack, int opponentsTotalDefence){
    System.out.println("Your opponent attacked.");
    System.out.println("Opponent's Attack Point: " + totalAttack);
    System.out.println("Luck Bonus: " + luckBonus);
    System.out.println("Your Defence: " + opponentsTotalDefence);
    if (damage >=0 ) System.out.println("Total damage taken: " + damage);
    else System.out.println("Total damage taken = 0");

  }
  
  
}
