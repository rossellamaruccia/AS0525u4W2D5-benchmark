package entities;

import java.util.*;

class Collection {
    private Map<UUID, Game> gameCollection;

    public Collection() {
        gameCollection = new HashMap<>();
    }

    public boolean addGame(Game game) {
        if (gameCollection.containsKey(game.getId())) {
            System.out.println("This ID already exists!");
            return false;
        }
        gameCollection.put(game.getId(), game);
        return true;
    }

    public Game idSearch(UUID id) {
        return gameCollection.get(id);
    }

    public List<Game> searchByPrice(double maxPrice) {
        return gameCollection.values().stream().filter(game -> game.getPrice() < maxPrice).toList();
    }

    public List<BoardGame> searchByNumOfPlayers(int numOfPlayers) {
        return gameCollection.values().stream().filter(game -> game instanceof BoardGame).map(game -> (BoardGame) game).filter(game -> game.getNumberOfPlayers() == numOfPlayers).toList();
    }

    public boolean removeGameById(UUID idToBeRemoved) {
        Game toBeRemoved = gameCollection.get(idToBeRemoved);
        return gameCollection.values().remove(toBeRemoved);
    }

    public void updateGameById(UUID idToBeModified, String modifiedTitle, double modifiedPrice) {
        Game toBeModified = gameCollection.get(idToBeModified);
        toBeModified.setTitle(modifiedTitle);
        toBeModified.setPrice(modifiedPrice);
    }

    public void statsInquiry() {
        long videogamesNum = gameCollection.values().stream()
                .filter(game -> game instanceof VideoGame)
                .count();

        long boardgamesNum = gameCollection.values().stream()
                .filter(game -> game instanceof BoardGame)
                .count();

        Optional<Game> mostExpensiveGame = gameCollection.values().stream()
                .max(Comparator.comparingDouble(Game::getPrice));

        OptionalDouble averagePrices = gameCollection.values().stream()
                .mapToDouble(Game::getPrice)
                .average();

        System.out.println("Info about this Game Collection:");
        System.out.println("- Number of video games: " + videogamesNum);
        System.out.println("- Number of boardgames: " + boardgamesNum);
        if (mostExpensiveGame.isPresent()) {
            System.out.println("- the most expensive game is: " + mostExpensiveGame.get());
        } else {
            System.out.println("- Looks like there are no games here :(");
        }
        if (averagePrices.isPresent()) {
            System.out.println("Average price is: $" + averagePrices);
        } else {
            System.out.println("- Looks like there are no games here :(");
        }
    }
}
