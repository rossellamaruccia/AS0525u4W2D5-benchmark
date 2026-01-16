package entities;

public class VideoGame extends Game {

    private int gameDuration;
    private String category;

    public VideoGame(String title, int yearOfRelease, double price, platform platform, int gameDuration, String category) {
        super(title, yearOfRelease, price);
        this.gameDuration = gameDuration;
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