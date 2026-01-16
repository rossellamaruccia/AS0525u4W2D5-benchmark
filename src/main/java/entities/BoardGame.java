package entities;

import java.util.Random;

public class BoardGame extends Game {
    Random rndm = new Random();
    private int numberOfPlayers;
    private int gameDuration;

    public BoardGame(String title) {
        super(title);
        this.numberOfPlayers = rndm.nextInt();
        this.gameDuration = rndm.nextInt();
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int newNumber) {
        this.numberOfPlayers = newNumber;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int newGameDuration) {
        this.gameDuration = newGameDuration;
    }
}