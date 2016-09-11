

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gui extends JPanel {

	private static final long serialVersionUID = 1;
	private World world;
	private int mode;
	
	public static final int DARK = 0;
	public static final int LIGHT = 1;

	public Gui(World world) {
		this.world = world;
		setPreferredSize(new Dimension(800, 600));
	}
	
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image darkBackground = (new ImageIcon("assets/background-dark.png")).getImage();
		Image lightBackground = (new ImageIcon("assets/background-light.png")).getImage();
		g.drawImage(mode == DARK ? darkBackground : lightBackground, 0, 0, 810, 610, null);
		
		final Graphics2D g2d = (Graphics2D) g;
		 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				 RenderingHints.VALUE_ANTIALIAS_ON);
		final Entity[][] grid = world.getGrid();
		final int width = getWidth() / grid.length;
		final int height = getHeight() / grid[0].length;
		g2d.setColor(new Color(255, 255, 255, mode == DARK ? 20 : 200));
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				g2d.drawRect(x * width, y * height, width, height);
				if (grid[x][y] != null) {
					grid[x][y].draw(g2d, x * width, y * height, width, height);
				}
			}
		}
	}

}
