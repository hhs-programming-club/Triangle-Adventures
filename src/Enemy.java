

import java.awt.Graphics2D;

public class Enemy extends Entity {

	@Override
	public void draw(Graphics2D g, int x, int y, int width, int height) {
		g.fillOval(x, y, width, height);
	}

}
