import java.awt.Graphics;
import java.awt.Color;

public class ProjectileSizePowerUp extends GameObject {
    private int speed;
    private static int sizeInc = 0;
    
    public ProjectileSizePowerUp(int x, int y, int width, int height, int speed) {
        super(x, y, width, height);
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public static int getSizeInc() {
        return sizeInc;
    }
    
    public static void increaseSize() {
        sizeInc++;
    }
    
    
    public void update() {
        setY(getY() + speed);
        
        if (getY() > GamePanel.SCREEN_HEIGHT) {
            setActive(false); // Use inherited setter to deactivate
        }
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}