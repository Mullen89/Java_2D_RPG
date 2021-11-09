package graphics.tiles;

import graphics.Assets;

public class BushTile extends Tile{

    public BushTile(int id) {
        super(Assets.bush, id);
    }
    
    @Override
    public boolean isPassable(){
        return false;
    }
}
