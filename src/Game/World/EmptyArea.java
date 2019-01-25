package Game.World;

import java.awt.Color;
import java.awt.Graphics;

import Main.Handler;
import Resources.Images;

public class EmptyArea extends BaseArea {
    public EmptyArea(Handler handler, int yPosition) {
        super(handler, yPosition);
    }
    
    @Override
    public void render(Graphics g) {
        for (int i = 0; i < 9; i++) {
            g.drawImage(Images.emptyArea, i*64, yPosition,64,65, null);

        }    }
}
