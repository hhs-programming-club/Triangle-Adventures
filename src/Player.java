import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;

public class Player extends Entity {

	private int dir;

	public synchronized boolean move() {
		waitForNextStep();

		final Point loc = world.getAdjacentLocation(this, dir);
		if (loc == null) return false;

		final Entity[][] grid = world.getGrid();
		if (grid[loc.x][loc.y] instanceof Enemy) {
			world.setActive(false);
			world.remove(this);
			return false;
		}
		else if (grid[loc.x][loc.y] instanceof Key) {
			world.remove(loc.x, loc.y);
		}
		else if (grid[loc.x][loc.y] instanceof Door) {
			for (Entity[] col : grid) {
				for (Entity e : col) {
					if (e instanceof Key) return false;
				}
			}

			world.remove(loc.x, loc.y);
		}

		return world.setLocation(this, loc.x, loc.y);
	}

	public synchronized void turnLeft() {
		waitForNextStep();

		dir += 90;
		dir %= 360;
		if (dir < 0) dir += 360;
	}

	public synchronized void turnRight() {
		waitForNextStep();

		dir -= 90;
		dir %= 360;
		if (dir < 0) dir += 360;
	}

	public synchronized boolean attack() {
		waitForNextStep();

		final Point loc = world.getAdjacentLocation(this, dir);
		if (loc == null) return false;

		final Entity e = world.getGrid()[loc.x][loc.y];
		if (e instanceof Enemy) {
			world.remove(e);
			return true;
		}

		return false;
	}

	public int getDirection() {
		return dir;
	}

	@Override
	public void draw(Graphics2D g, int x, int y, int width, int height) {
		final Point c = new Point(x + width / 2, y + height / 2);
		final Point p1 = new Point(width / 2, 0);
		final Point p2 = new Point(-width / 2, height / 2);
		final Point p3 = new Point(-width / 2, -height / 2);
		final AffineTransform tx = g.getTransform();
		g.translate(c.x, c.y);
		g.rotate(-Math.toRadians(dir));
		g.fill(new Polygon(new int[]{p1.x, p2.x, p3.x},
				new int[]{p1.y, p2.y, p3.y}, 3));
		g.setTransform(tx);
	}

}
