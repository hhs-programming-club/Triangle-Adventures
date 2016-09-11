import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;

public class Door extends Entity{

	@Override
	public void draw(Graphics2D g, int x, int y, int width, int height) {
		final Point c = new Point(x + width / 2, y + width / 2);
		g.fill(new Polygon(new int[]{c.x, x + width, c.x, x},
				new int[]{y, c.y, y + height, c.y}, 4));
	}

}
