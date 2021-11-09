package graphics.tiles;

import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Tile {
    
    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile(1);
    public static Tile stoneTile = new StoneTile(2);
    public static Tile sandTile = new SandTile(3);
    public static Tile bush = new BushTile(9);

    public static final int TILE_WIDTH = 64;
    public static final int TILE_HEIGHT = 64;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick(){}

    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    public int getId(){
        return id;
    }

    public boolean isPassable(){
        return true;
    }
}
