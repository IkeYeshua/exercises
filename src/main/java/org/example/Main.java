package org.example;

import beersong.BeerSong;
import chaptertwoexercises.Echo;
import drumkit.DrumKit;
import elementaryprogramming.ElementaryProgramming;
import game.GuessGame;
import game.Player;
import headfirstexercises.ChapterOne;
import loan.ComputeLoan;
import recording.DVDPlayer;
import recording.TapeDeck;

public class Main {
    public static void main(String[] args) {
        ElementaryProgramming elementaryProgramming = new ElementaryProgramming();
        ComputeLoan computeLoan = new ComputeLoan();
        BeerSong beerSong = new BeerSong();
        ChapterOne chapterOne = new ChapterOne();
        GuessGame gameLuncher = new GuessGame();
        TapeDeck tapeDeck = new TapeDeck();
        tapeDeck.playTape();
        tapeDeck.displayTheTapeDeck();


        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.playDVD();
        dvdPlayer.displayTheDVDPlaying();

        DrumKit drumKit = new DrumKit();
        drumKit.displayTheDrumKit();
        drumKit.playTopHat();

        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 5) {
            System.out.println("heloooo...");
            e1.count += 1;
            if (x > 0) {
               e2.count += 1;
            }
            if (x > 1) {
                e2.count += e1.count;
            }
            System.out.println(e2.count);
        }



        //gameLuncher.startGame();

        //computeLoan.computeLoan();
       // elementaryProgramming.calculate();
       // elementaryProgramming.displayingTime();
      //  elementaryProgramming.fahrenheitToCelsius();
        //elementaryProgramming.showCurrentTime();
        //elementaryProgramming.printOutVariableA();
        //elementaryProgramming.printOutVariableX();
        //elementaryProgramming.solve();
       // elementaryProgramming.salesTax();
        //elementaryProgramming.exampleOfWhileLoop();
        //elementaryProgramming.ifTest1();
        //elementaryProgramming.ifTest2();
       // elementaryProgramming.dooBee();
        //elementaryProgramming.phraseOmMatic();
       // beerSong.beerSong();
        //chapterOne.shuffle();
        //chapterOne.exerciseA();
        //chapterOne.exerciseB();
        //chapterOne.test1();
       // chapterOne.test2();
       // chapterOne.test3();
        //chapterOne.test4();
        //chapterOne.test5();
        //chapterOne.poolPuzzleOne();



    }


}
