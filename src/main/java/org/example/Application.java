package org.example;

import com.github.javafaker.Faker;
import entities.BoardGame;
import entities.GameCollection;
import entities.VideoGame;
import entities.platform;

public class Application {

    public static void main(String[] args) {
        Faker faker = new Faker();

        GameCollection gameCollection = new GameCollection();
        for (int i = 0; i < 25; i++) {
            gameCollection.addGame(new BoardGame(faker.book().title()));
            gameCollection.addGame(new VideoGame(faker.book().title(), platform.Computer, faker.book().genre()));
        }

        
    }
}
