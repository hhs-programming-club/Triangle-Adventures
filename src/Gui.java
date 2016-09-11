

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Gui extends JPanel {

	private static final long serialVersionUID = 1;
	private World world;

	public Gui(World world) {
		this.world = world;
		setPreferredSize(new Dimension(800, 600));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		final Graphics2D g2d = (Graphics2D) g;
		 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				 RenderingHints.VALUE_ANTIALIAS_ON);
		final Entity[][] grid = world.getGrid();
		final int width = getWidth() / grid.length;
		final int height = getHeight() / grid[0].length;

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
