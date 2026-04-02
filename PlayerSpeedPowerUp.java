import java.awt.Graphics;
import java.awt.Color;

public class PlayerSpeedPowerUp extends GameObject {
    private int speed;
    
    public PlayerSpeedPowerUp(int x, int y, int width, int height, int speed) {
        super(x, y, width, height);
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    public void update() {
        setY(getY() + speed);
        
        if (getY() > GamePanel.SCREEN_HEIGHT) {
            setActive(false); // Use inherited setter to deactivate
        }
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}