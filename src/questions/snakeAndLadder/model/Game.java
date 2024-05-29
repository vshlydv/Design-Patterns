package questions.snakeAndLadder.model;

public class Game {
    private volatile static Game game;

    private Game() {

    }

    public Game getGame() {
        Game localGame = game;
        if (null != localGame)
            return game;
        synchronized (game) {
            if (null == game)
                new Game();
            return game;
        }
    }
}
