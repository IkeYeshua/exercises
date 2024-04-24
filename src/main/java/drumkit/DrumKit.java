package drumkit;

public class DrumKit {
    boolean topHat = true;
    boolean snare = false;

    public void playSnare() {
        System.out.println("bang bang ba-bang");

    }

    public void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    public void displayTheDrumKit() {
        snare = true;
        if (snare == true) {
            playSnare();
        }
    }

}
