package recording;



public class TapeDeck {
  public boolean canRecord = false;


  public void playTape() {
      System.out.println("tape playing");
  }

 public void recordTape() {

      System.out.println("tape recording");
  }

 public void displayTheTapeDeck(){
      canRecord = true;
      if (canRecord == true) {
          recordTape();
      }
 }
}
