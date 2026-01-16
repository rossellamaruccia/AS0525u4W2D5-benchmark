package entities;

import java.util.Random;

public class VideoGame extends Game {

    Random rndm = new Random();
    private int gameDuration;
    private String category;

    public VideoGame(String title, platform platform, String category) {
        super(title);
        this.gameDuration = rndm.nextInt();
        this.category = category;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int newGameDuration) {
        this.gameDuration = newGameDuration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}