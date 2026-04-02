import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class GameOverText extends GameObject {
    public GameOverText(int x, int y, int height, int width) {
        super(x, y, height, width);
        this.setActive(false);
    }
    
    public void update() {
        getX();
    }
    
    public void draw(Graphics g) {
        if (isActive()) {
            g.setColor(Color.WHITE);
            
            Font currentFont = g.getFont();
            Font newFont = currentFont.deriveFont(currentFont.getSize() * 5F);
            g.setFont(newFont);
            
            g.drawString("Game Over", getX(), getY());
        }
    }
}