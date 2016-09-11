
import java.awt.Graphics2D;

public class Wall extends Entity {

	@Override
	public void draw(Graphics2D g, int x, int y, int width, int height) {
		g.fillRect(x, y, width, height);
	}

}
