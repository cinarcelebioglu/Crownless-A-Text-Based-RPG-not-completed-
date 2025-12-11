import java.util.InputMismatchException;
import java.util.Scanner;

public class Prologue{
  Scanner scanner = new Scanner(System.in);              
  int classNumber = 0;
  boolean validInput = false;
  Player player;

  public void start(){
    intro();
    classSelection();
  }

  private void intro(){
    System.out.println("""
                      ********************************
                      Crownless, A Text-Based RPG Game
                      ********************************
                      """);

    
    System.out.print("What is your name, hero: ");
    String playerName = scanner.nextLine();
    player = new Player(playerName);
    System.out.println();
    System.out.println("""
                      The tavern is warm, a rare comfort in a time of blood 
                      and shadow. Outside, Cruthena banners clash with the 
                      green and silver of the Nkai Elves. The war has torn 
                      through cities and forests alike, leaving smoke in the 
                      air and fear in the hearts of men. Yet here, in this 
                      small village untouched by marching armies, life continues
                      in quiet defiance. Farmers tend fields scarred by neglect, 
                      merchants whisper of battles far away, and children play among
                      the ruins of a time the crown seems to have forgotten.                      
                      """);

    System.out.println("Press 'ENTER' to Continue");
    scanner.nextLine();
  }


  private void classSelection(){
    System.out.println("""
                    1: Warrior(Base Attack=1, Base Defence=3, Base Luck=2)
                    2: Archer(Base Attack=3, Base Defence=2, Base Luck=1)
                    3: Mage(Base Attack=2, Base Defence=1, Base Luck=3)
                    """);

    do {
      System.out.print("Pick your class (1: Warrior, 2: Archer, 3: Mage): ");
        try {
          classNumber = scanner.nextInt();
          if (classNumber == 1 || classNumber == 2 || classNumber == 3) {
            player.setClass(classNumber);
            validInput = true;
          } else {
              System.out.println("Please enter a valid number (1-3).");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
            scanner.nextLine();
          }
    } while (!validInput);

    System.out.println("Class selected: " + player.getPlayerClass());
    System.out.println("And now, " + player.getName() + ", your story begins");
    scanner.nextLine();
    System.out.println("Press 'ENTER' to Continue");
    scanner.nextLine();
  }


  public Player getPlayer() {
    return player;
  }
}
