package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
}
