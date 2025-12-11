import java.util.Random;
import java.util.Scanner;

public class CombatSimulation {
  Scanner scanner;
  Random random; 
  int playerAttack, playerLuck, playerDefence, opponentAttack, opponentDefence, opponentLuck;
  double playerHP, opponentHP;
  public CombatSimulation(double playerHP, int playerAttack, int playerLuck, int playerDefence,
    double opponentHP, int opponentAttack, int opponentDefence, int opponentLuck){
      this.playerHP = playerHP;
      this.playerAttack= playerAttack;
      this.playerLuck= playerLuck;
      this.playerDefence = playerDefence;
      this.opponentHP = opponentHP;
      this.opponentAttack = opponentAttack;
      this.opponentDefence = opponentDefence;
      this.opponentLuck = opponentLuck;                      
    }
    public void start(){
      scanner = new Scanner(System.in);
      random = new Random();
      while(playerHP > 0 && opponentHP > 0 ){
        boolean bool = false;
        int decision = 0;
        int turn = random.nextInt(2);
        if (turn == 1) {
          do{
            try{
              System.out.println("1) Attack, then improve your guard");
              System.err.println("2) Attack with full effort");
              decision = scanner.nextInt();
              bool = true;
            } catch(IllegalArgumentException e){System.out.println("Enter a valid response");}
          } while(!bool);
          opponentHP = opponentHP - CombatSystem.playerAttacks(playerAttack, playerLuck, opponentDefence, decision);
          System.out.println("Opponent's current HP: " + opponentHP);
          System.out.println("Press ENTER to Continue");
          scanner.nextLine();
          scanner.nextLine();
        }
        else {
        playerHP = playerHP - CombatSystem.opponentAttacks(playerDefence, opponentAttack, opponentLuck, decision);
        System.out.println("Your current HP: " + playerHP);
        System.out.println("Press ENTER to Continue");
        scanner.nextLine();
        scanner.nextLine();
        }
      }
      if (opponentHP < 0 ) {
        System.out.println("You've won the combat.");
      }
      else {
        System.out.println("Try Again.");
        scanner.nextLine();
      }
    }
  }
  
  