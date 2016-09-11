
import java.awt.Color;
import java.awt.Graphics2D;

public class Wall extends Entity {

	@Override
	public void draw(Graphics2D g, int x, int y, int width, int height) {
		Color prevColor = g.getColor();
		g.setColor(new Color(140, 140, 140, 150));
		g.fillRect(x, y, width, height);
		g.setColor(prevColor);
	}

}
