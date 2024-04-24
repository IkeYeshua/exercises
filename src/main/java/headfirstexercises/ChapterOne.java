package headfirstexercises;

public class ChapterOne {
    public void shuffle(){
        int x = 3;

        while (x > 0) {
            if (x > 2){
                System.out.print("a");
                System.out.print("-");

            }

            x--;

            if (x == 2) {
                System.out.print("b c");
                System.out.print("-");
            }

            if (x == 1) {
                System.out.println("d");
            }


        }
    }
    public void exerciseA(){
        int x = 1;
        while (x < 10) {
            x++;
            if ( 3 > x) {
                System.out.println("big x");
            }
            //x++;
        }


    }

    public void exerciseB(){
        int x = 5;
        while (x > 1) {
            x--;
            if ( 3 < x) {
                System.out.println("small x");
            }
            //x--;
        }
    }
    public void test1(){
        int x = 0;
        int y = 0;
        while (x < 5) {
             y += x;
            System.out.println(x + "" + y + "");
            x++;
        }
    }
    public void test2(){
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y;
            System.out.println(x + "" + y + "");
            x++;
        }

    }
    public void test3(){
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = y + 2;
            if(y > 4) {
                y -= 1;
            }
            System.out.println(x + "" + y + "");
            x++;
        }

    }
    public void test4() {
        int x = 0;
        int y = 0;
        while (x < 5) {
            x += 1;
            y += x;
            System.out.println(x + "" + y + "");
            x++;
        }
    }
    public void test5() {
        int x = 0;
        int y = 0;
        while (x < 5) {
            if (y < 5) {
               x += 1;
               if (y < 3) {
                   x -= 1;
               }
            }
            y += 2;
            System.out.println(x + "" + y + "");
            x++;
        }

    }
    public void poolPuzzleOne() {
        int x = 0;
        while (x < 1) {
            if (x < 1) {
                x += 1;
            }
            System.out.print("a ");
            if (x > 0) {
                System.out.print("n");
                System.out.print("oise");
            }
            System.out.println();
            if (x == 1) {
                System.out.print("annoys ");
            }
            System.out.println();
            if (x < 3) {
                System.out.print("an ");
            }
            System.out.println("oyster");
          x++;
        }

    }
}
