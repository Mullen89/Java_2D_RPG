package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys;
    public boolean up, down, left, right;

    public KeyManager() {
        keys = new boolean[256];
    }

    public void tick() {
        up = keys[KeyEvent.VK_W];       // Up
        down = keys[KeyEvent.VK_S];     // Down
        left = keys[KeyEvent.VK_A];     // Left
        right = keys[KeyEvent.VK_D];    // Right
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
