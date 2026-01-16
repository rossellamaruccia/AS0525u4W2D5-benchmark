package org.example;

import com.github.javafaker.Faker;
import entities.BoardGame;
import entities.GameCollection;
import entities.VideoGame;
import entities.platform;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {
        Faker faker = new Faker();

        GameCollection gameCollection = new GameCollection();
        for (int i = 0; i < 25; i++) {
            gameCollection.addGame(new BoardGame(faker.book().title()));
            gameCollection.addGame(new VideoGame(faker.book().title(), platform.Computer, faker.book().genre()));
        }

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("--- Menu ---");
            System.out.println("1. Add a game to the Collection");
            System.out.println("2. find a game by ID");
            System.out.println("3. search games by price");
            System.out.println("4. search boardgames by n. of players");
            System.out.println("5. remove game by ID");
            System.out.println("6. update a game by ID");
            System.out.println("7. Collection stats");
            System.out.println("8. Let's see what we've got!");
            System.out.println("0. Exit");
            System.out.print("Enter a number: ");

            int choice = 1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Gooby pls enter a valid number from 0 to 8");
            }

            switch (choice) {
                case 1:
                    addGameToTheCollection(scanner, gameCollection);
                    break;
                case 2:
                    ;
                case 3:
                    ;
                case 4:
                    ;
                case 5:
                    removeGameByID(scanner, gameCollection);
                    break;
                case 6:
                    updateGameByID(scanner, gameCollection);
                    break;
                case 7:
                    gameCollection.statsInquiry();
                    break;
                case 8:
                    gameCollection.printAll();
                    break;
                case 0:
                    running = false;
                    System.out.println("thanks, bye!");
                    break;
                default:
                    System.out.println("Gooby pls");
                    break;
            }
        }
    }

    private static void removeGameByID(Scanner scanner, GameCollection gameCollection) {
        try {
            System.out.println("insert the ID of the game you want to remove: ");
            UUID idToBeRemoved = UUID.fromString(scanner.nextLine());
            gameCollection.removeGameById(idToBeRemoved);
            System.out.println("Game removed! Thanks!");
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Gooby pls you inserted the wrong input");
        }
    }

    private static void updateGameByID(Scanner scanner, GameCollection gameCollection) {
        try {
            System.out.println("insert the ID of the game you want to modify: ");
            UUID idToBeModified = UUID.fromString(scanner.nextLine());
            System.out.println("insert the new title: ");
            String newTitle = scanner.nextLine();
            System.out.println("insert the new price: $");
            double newPrice = scanner.nextDouble();
            gameCollection.updateGameById(idToBeModified, newTitle, newPrice);
            System.out.println("Game updated! Thanks!");
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Gooby pls you inserted the wrong input");
        }
    }

    private static void addGameToTheCollection(Scanner scanner, GameCollection gameCollection) {
        System.out.println("video or board?");
        if (scanner.nextLine().equals("board")) {
            System.out.println("Ok, enter the title");
            String title = scanner.nextLine();
            gameCollection.addGame(new BoardGame(title));
            System.out.println("Boardgame added, thanks! See you!");
        } else if (scanner.nextLine().equals("video")) {
            System.out.println("Not yet, come back tomorrow!");
        } else {
            System.out.println("Gooby pls!");
        }
    }
}
