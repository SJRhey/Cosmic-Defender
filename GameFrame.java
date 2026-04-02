import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * The main application window for the Cosmic Defender game.
 * Sets up the JFrame and adds the GamePanel to it.
 */
public class GameFrame extends JFrame {

    /**
     * Constructor for GameFrame.
     * Configures the window properties and adds the game panel.
     */
    public GameFrame() {
        setTitle("Cosmic Defender"); // Window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        setResizable(false); // Prevent window resizing

        GamePanel gamePanel = new GamePanel(); // Create an instance of the game panel
        add(gamePanel); // Add the game panel to the frame
        pack(); // Adjusts frame size to fit its contents (the gamePanel's preferred size)

        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true); // Make the frame visible

        // Request focus for the game panel so it can receive keyboard events immediately
        gamePanel.requestFocusInWindow();
    }

    /**
     * Main method to start the game application.
     * Ensures the GUI is created and updated on the Event Dispatch Thread (EDT).
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure GUI updates are done on the EDT
        SwingUtilities.invokeLater(() -> new GameFrame());
    }
}
