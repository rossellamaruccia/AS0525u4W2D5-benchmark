package entities;

public abstract class Game {
    private String id;
    private String title;
    private int yearOfRelease;
    private double price;

    public Game(String id, String title, int yearOfRelease, double price) {
        this.id = id;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getPrice() {
        return price;
    }
    
}