package elementaryprogramming;

import java.util.Scanner;

public class ElementaryProgramming {

    public void calculate(){
        System.out.println(2 * Math.pow(2,2));
    }

    public void displayingTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer for seconds");
        int seconds = scanner.nextInt();
        int minutes = seconds/60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes +
                 " minutes and " + remainingSeconds + " seconds");
    }

    public void fahrenheitToCelsius (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                 celsius + " in Celsius");

    }

    public void showCurrentTime(){
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds/1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds/60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes/60;

        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");

    }

    public  void printOutVariableA(){
        double a = 6.5;
        a += 1;
        System.out.println(a);
    }
    public void printOutVariableX(){
        int x = 6;
        x /= 2;
        System.out.println(x);
    }
    public void solve(){
        double x = 1.0;
        double y = 5.0;
        double a = --x;
        double z = a + (++y);

        System.out.println(z);
        System.out.println(a);
    }
    public void salesTax(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter purchase amount");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100)/100.0);
    }
    public void exampleOfWhileLoop(){
        int x = 1;
        System.out.println("Before the loop");
        while (x < 4){
            System.out.println("in the loop");
            System.out.println("value of x is " + x);
            x++;

        }
        System.out.println("This is after the loop");
    }

    public void ifTest1(){
        int x = 3;
        if(x == 3){
            System.out.println("x must be 3");
        }
        System.out.println("This runs no matter what");
    }

    public void ifTest2(){
        int x = 2;
        if(x == 3) {
            System.out.println("x must be 3");
        } else {
            System.out.println("x is not 3");
        }
        System.out.println("This must run no matter what");
    }
    public void dooBee(){
        int x = 1;
        while (x < 3){
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
        if (x == 3){
            System.out.println("Do");
        }

    }
    public void phraseOmMatic(){
        String[] wordList1 = {"multi-tire", "web-based", "pervasive", "B-to-B","win-win","front-end", "smart"};
        String[] wordList2 = {"empowered", "sticky", "value-added", "oriented","centric","distributed", "shared"};
        String[] wordList3 = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal"};

        int lenght1 = wordList1.length;
        int lenght2 = wordList2.length;
        int lenght3 = wordList3.length;
        String allLenghts = lenght1 + " " + lenght2 + " " + lenght3;
        System.out.println("All the lenghts " + allLenghts);

        int rand1 = (int) (Math.random() * lenght1);
        int rand2 = (int) (Math.random() * lenght2);
        int rand3 = (int) (Math.random() * lenght3);
        System.out.println(rand1 + " " + rand2 + " " + rand3);

        String phrase = wordList1[rand1] + " " + wordList2[rand2] +
                " " + wordList3[rand3];
        System.out.println("What we need is a " + phrase);
    }


}
