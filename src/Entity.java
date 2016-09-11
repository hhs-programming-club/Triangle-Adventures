

import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Entity {

	protected World world;

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public Point getLocation() {
		return world.getLocation(this);
	}

	public abstract void draw(Graphics2D g, int x, int y, int width, int height);

	protected synchronized void waitForNextStep() {
		try {
			wait();
		} catch (InterruptedException e) { e.printStackTrace(); }
	}

}
