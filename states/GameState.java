package states;

import java.awt.Graphics;
import entities.creatures.Player;
import graphics.tiles.Tile;
import main.Game;

public class GameState extends StateManager {

    private Player player;

    public GameState(Game game) {
        super(game);
        player = new Player(game, 500, 200);
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        player.render(g);

        // TILE TEST
        Tile.tiles[0].render(g, 0, 0);
        Tile.tiles[1].render(g, 64, 0);
        Tile.tiles[2].render(g, 128, 0);
        Tile.tiles[3].render(g, 0, 64);
        Tile.tiles[9].render(g, 64, 64);
    }
}
