package entities;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Game {
    private final UUID id;
    private final int yearOfRelease;
    int minYear = 1980;
    int maxYear = 2026;
    double minPrice = 10.01;
    double maxPrice = 50.50;
    int rndmYear = ThreadLocalRandom.current().nextInt(minYear, maxYear + 1);
    double rndmPrice = ThreadLocalRandom.current().nextDouble(minPrice, maxPrice + 1);
    private String title;
    private double price;

    public Game(String title) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.yearOfRelease = rndmYear;
        this.price = rndmPrice;
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