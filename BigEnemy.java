import java.awt.Color;
import java.awt.Graphics;

public class BigEnemy extends Enemy {
    private int health;
    
    public BigEnemy(int x, int y, int width, int height, int speed, int health) {
        super(x, y, width, height, speed);
        this.health = health;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}