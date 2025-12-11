public abstract class GameStats {
  private static int crownAlignment;

  public static int getCrownAlignment(){
    return crownAlignment;
  }
  
  public static void setCrownAlignment(int change){
    crownAlignment = crownAlignment + change;
  }
}
