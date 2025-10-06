import java.util.List;

public class Game {

  List<Act> acts = List.of(new Prologue());

  void start() {
      for (Act act : acts) {
        act.start();
      }
  }
}


