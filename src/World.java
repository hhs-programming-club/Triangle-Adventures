
import java.awt.Point;

public class World {

	private Entity[][] grid;
	private boolean active;

	public World() {
		this(8, 6);
	}

	public World(int x, int y) {
		grid = new Entity[x][y];
		active = true;
	}

	public Entity[][] getGrid() {
		return grid;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Point getLocation(Entity e) {
		if (e == null) return null;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				if (grid[x][y] == e) return new Point(x, y);
			}
		}
		return null;
	}

	public boolean setLocation(Entity e, int x, int y) {
		Point loc = getLocation(e);
		if (loc == null) throw new IllegalStateException();

		if (checkBounds(x, y) && grid[x][y] == null) {
			grid[loc.x][loc.y] = null;
			grid[x][y] = e;
			return true;
		}

		return false;
	}

	public Point getAdjacentLocation(Entity e, int dir) {
		final Point loc = getLocation(e);
		if (loc == null) return null;

		if (dir > 0 && dir < 180) loc.y -= 1;
		else if (dir > 180) loc.y += 1;
		if (dir < 90 || dir > 270) loc.x += 1;
		else if (dir > 90 && dir < 270) loc.x -= 1;

		return checkBounds(loc.x, loc.y) ? loc : null;
	}

	public boolean add(Entity e, int x, int y) {
		if (e == null || !checkBounds(x, y)) return false;
		grid[x][y] = e;
		e.setWorld(this);
		return true;
	}

	public Entity remove(int x, int y) {
		final Entity e = grid[x][y];
		if (e != null) e.setWorld(null);
		grid[x][y] = null;
		return e;
	}

	public Entity remove(Entity e) {
		final Point loc = getLocation(e);
		if (loc != null) return remove(loc.x, loc.y);
		return null;
	}

	public synchronized void step() {
		for (Entity[] col : grid) {
			for (Entity e : col) {
				if (e != null) synchronized (e) { e.notify(); }
			}
		}
	}

	private boolean checkBounds(int x, int y) {
		return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
	}

}
