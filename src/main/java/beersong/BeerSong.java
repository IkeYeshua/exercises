package beersong;

public class BeerSong {

    public void beerSong(){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                System.out.println(word = " bottle ");
                //word = "bottle";
            }
            System.out.println(beerNum + " " + word + "  of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around.");
            beerNum--;


            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " beer on the wall");

            } else {
                System.out.println("No more bottles of beer on the wall");

            }
        }

    }

}
