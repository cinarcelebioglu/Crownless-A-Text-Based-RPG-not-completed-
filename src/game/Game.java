package game;
import acts.Act1;
import acts.Prologue;
import characters.Player;

public class Game {
  private Player player;

  public void start() {
      Prologue prologue = new Prologue();
      prologue.start();
      this.player = prologue.getPlayer();
      Act1 act1 = new Act1(player);
      act1.start();
  }
}


