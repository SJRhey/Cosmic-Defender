import java.awt.Color;
import java.awt.Graphics;

public class FastEnemy extends Enemy {
    private int[] xPoints;
    private int[] yPoints;
    
    public FastEnemy(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed);
        xPoints = new int[3];
        xPoints[0] = getX();
        xPoints[1] = getX() + getWidth();
        xPoints[2] = (2 * getX() + getWidth()) / 2;
        
        yPoints = new int[3];
        yPoints[0] = getY();
        yPoints[1] = getY();
        yPoints[2] = getY() + getHeight();
    }
    
    public int[] getXPoints() {
        return xPoints;
    }
    
    public int[] getYPoints() {
        return yPoints;
    }
    
    
    public int getXPoint(int index) {
        return xPoints[index];
    }
    
    public int getYPoint(int index) {
        return yPoints[index];
    }
    
    
    public void setXPoint(int index, int newX) {
        xPoints[index] = newX;
    }
    
    public void setYPoint(int index, int newY) {
        yPoints[index] = newY;
    }
    
    
    public void update() {
        setYPoint(0, getYPoint(0) + getSpeed());
        setYPoint(1, getYPoint(1) + getSpeed());
        setYPoint(2, getYPoint(2) + getSpeed());
        setY(getYPoint(0));
        setX(getXPoint(0));
        
        if (getYPoint(0) > GamePanel.SCREEN_HEIGHT) {
            setActive(false);
        }
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.RED); // Enemy is red
        // Use inherited getters for drawing position and dimensions
        g.fillPolygon(xPoints, yPoints, 3); // Draw as a circle/oval
    }
}