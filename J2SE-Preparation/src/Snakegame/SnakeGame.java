package Snakegame;

import javax.swing.JFrame;

public class SnakeGame extends JFrame {

	public SnakeGame() {
		// Initialize the game panel
		add(new GamePanel());

		// Set window properties
		setTitle("Snake Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pack(); // Size the frame to fit the preferred size of the panel
		setLocationRelativeTo(null); // Center the window
	}

	public static void main(String[] args) {
		// Create the game window on the Event Dispatch Thread
		javax.swing.SwingUtilities.invokeLater(() -> {
			JFrame frame = new SnakeGame();
			frame.setVisible(true);
		});
	}
}
