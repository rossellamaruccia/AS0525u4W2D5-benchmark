package entities;

import java.util.UUID;

public abstract class Game {
    private final UUID id;
    private String title;
    private int yearOfRelease;
    private double price;

    public Game(String title, int yearOfRelease, double price) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}