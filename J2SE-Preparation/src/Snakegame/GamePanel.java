package Snakegame;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

	private final int GRID_SIZE = 20; // Size of each cell in the grid
	private final int GRID_WIDTH = 20; // Number of cells in width
	private final int GRID_HEIGHT = 20; // Number of cells in height
	private final int PANEL_WIDTH = GRID_SIZE * GRID_WIDTH;
	private final int PANEL_HEIGHT = GRID_SIZE * GRID_HEIGHT;
	private final int INITIAL_SNAKE_LENGTH = 3;
	private final int DELAY = 140; // Delay for timer (lower = faster)

	private final LinkedList<int[]> snake = new LinkedList<>();
	private int[] food = new int[2];
	private String direction = "RIGHT";
	private boolean running = false;
	private Timer timer;

	public GamePanel() {
		// Set panel properties
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(new TAdapter());

		// Initialize game
		initGame();
	}

	private void initGame() {
		// Initialize snake
		for (int i = 0; i < INITIAL_SNAKE_LENGTH; i++) {
			snake.add(new int[] { GRID_HEIGHT / 2, GRID_WIDTH / 2 - i });
		}

		// Place initial food
		placeFood();

		// Start game
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();
	}

	private void placeFood() {
		Random random = new Random();
		int foodX, foodY;
		do {
			foodX = random.nextInt(GRID_WIDTH);
			foodY = random.nextInt(GRID_HEIGHT);
		} while (isSnake(foodX, foodY));
		food[0] = foodY;
		food[1] = foodX;
	}

	private boolean isSnake(int x, int y) {
		for (int[] part : snake) {
			if (part[0] == y && part[1] == x) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	private void draw(Graphics g) {
		if (running) {
			// Draw food
			g.setColor(Color.RED);
			g.fillRect(food[1] * GRID_SIZE, food[0] * GRID_SIZE, GRID_SIZE, GRID_SIZE);

			// Draw snake
			for (int i = 0; i < snake.size(); i++) {
				if (i == 0) {
					g.setColor(Color.GREEN); // Head of the snake
				} else {
					g.setColor(Color.YELLOW); // Body of the snake
				}
				int[] part = snake.get(i);
				g.fillRect(part[1] * GRID_SIZE, part[0] * GRID_SIZE, GRID_SIZE, GRID_SIZE);
			}

			// Sync drawing
			Toolkit.getDefaultToolkit().sync();
		} else {
			gameOver(g);
		}
	}

	private void gameOver(Graphics g) {
		String msg = "Game Over";
		Font small = new Font("Helvetica", Font.BOLD, 20);
		FontMetrics fm = getFontMetrics(small);

		g.setColor(Color.RED);
		g.setFont(small);
		g.drawString(msg, (PANEL_WIDTH - fm.stringWidth(msg)) / 2, PANEL_HEIGHT / 2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			checkCollision();
			checkFood();
		}
		repaint();
	}

	private void move() {
		int[] head = snake.peekFirst();
		int newY = head[0];
		int newX = head[1];

		switch (direction) {
		case "UP":
			newY--;
			break;
		case "DOWN":
			newY++;
			break;
		case "LEFT":
			newX--;
			break;
		case "RIGHT":
			newX++;
			break;
		}

		// Move the snake
		snake.addFirst(new int[] { newY, newX });
		snake.removeLast();
	}

	private void checkCollision() {
		int[] head = snake.peekFirst();
		int headY = head[0];
		int headX = head[1];

		// Check if the snake hits the wall
		if (headX < 0 || headX >= GRID_WIDTH || headY < 0 || headY >= GRID_HEIGHT) {
			running = false;
		}

		// Check if the snake hits itself
		for (int i = 1; i < snake.size(); i++) {
			int[] part = snake.get(i);
			if (part[0] == headY && part[1] == headX) {
				running = false;
			}
		}

		if (!running) {
			timer.stop();
		}
	}

	private void checkFood() {
		int[] head = snake.peekFirst();
		int headY = head[0];
		int headX = head[1];

		if (headY == food[0] && headX == food[1]) {
			// Grow the snake
			snake.addFirst(new int[] { food[0], food[1] });
			placeFood();
		}
	}

	private class TAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();

			switch (key) {
			case KeyEvent.VK_LEFT:
				if (!direction.equals("RIGHT")) {
					direction = "LEFT";
				}
				break;
			case KeyEvent.VK_RIGHT:
				if (!direction.equals("LEFT")) {
					direction = "RIGHT";
				}
				break;
			case KeyEvent.VK_UP:
				if (!direction.equals("DOWN")) {
					direction = "UP";
				}
				break;
			case KeyEvent.VK_DOWN:
				if (!direction.equals("UP")) {
					direction = "DOWN";
				}
				break;
			}
		}
	}
}
