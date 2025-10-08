
public class CombatSystem {

  public static double calculateDamage(int totalAttack, int totalLuck, int opponentsTotalDefence) {
    double luckBonus = Math.random() * totalLuck;
    double damage = totalAttack + luckBonus - opponentsTotalDefence;
    promptDamage(luckBonus, damage, totalAttack, opponentsTotalDefence);
    if (damage > 0) {return damage;}
    else{damage = 0; return damage;}
  }

  public static void promptDamage(double luckBonus, double damage, int totalAttack, int opponentsTotalDefence){
    System.out.println("Attack Point: " + totalAttack);
    System.out.println("Luck Bonus: " + luckBonus);
    System.out.println("Opponent's Defence: " + opponentsTotalDefence);
    System.out.println("Total damage: " + damage);
  }


}
