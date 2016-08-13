package thezalesskiy;

import java.io.IOException;
import java.util.ArrayList;

import java.io.IOException;
import java.util.ArrayList;


public class Hippodrome {
    ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException, IOException {
        game = new Hippodrome();
        Horse horse = new Horse("Morgan", 3, 0);
        Horse horse1 = new Horse("Neo", 3, 0);
        Horse horse2 = new Horse("Tylda", 3, 0);

        game.addHorse(horse);
        game.addHorse(horse1);
        game.addHorse(horse2);

        game.run();
        game.printWinner();

    }

    public Hippodrome() {
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void addHorse(Horse horse) {
        this.horses.add(horse);
    }

    public void run() throws InterruptedException, IOException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move() {
        for (Horse horse : this.horses) {
            horse.move();
        }

    }

    public void print() throws IOException {
        for (Horse horse : this.horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();

    }

    public Horse getWinner() {
        Horse winner = new Horse("winner",0,0);
        for (Horse h : getHorses()){
            if (h.getDistance()>winner.getDistance()){
                winner = h;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");

    }


}
