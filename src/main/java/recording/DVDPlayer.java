package recording;

public class DVDPlayer {
   public boolean canRecord = false;

   public void recordDVD() {
        System.out.println("DVD recordinng");
    }

    public void playDVD() {
        System.out.println("DVD playing");
    }

    public void displayTheDVDPlaying() {
       canRecord = true;
       if (canRecord == true) {
           recordDVD();
       }
    }
}


