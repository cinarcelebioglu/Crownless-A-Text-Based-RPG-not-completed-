
public class Game {
  private Player player;

  void start() {
      Prologue prologue = new Prologue();
      prologue.start();
      this.player = prologue.getPlayer();
      Act1 act1 = new Act1(player);
      act1.start();
  }
}


