package entities;

public class BoardGame extends Game {
    private int numberOfPlayers;
    private int gameDuration;

    public BoardGame(String id, String title, int yearOfRelease, double price, int numberOfPlayers, int gameDuration) {


        super(id, title, yearOfRelease, price);
        this.numberOfPlayers = numberOfPlayers;
        this.gameDuration = gameDuration;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int newGameDuration) {
        this.gameDuration = newGameDuration;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int newNumber) {
        this.numberOfPlayers = newNumber;
    }
}