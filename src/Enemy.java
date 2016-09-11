

import java.awt.Color;
import java.awt.Graphics2D;

public class Enemy extends Entity {

	@Override
	public void draw(Graphics2D g, int x, int y, int width, int height) {
		Color prevColor = g.getColor();
		g.setColor(new Color(200, 47, 47));
		g.fillOval(x, y, width, height);
		g.setColor(prevColor);
	}

}
