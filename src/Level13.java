public class Level13 implements Level {

	private static final int X_MAX = 6;
	private static final int Y_MAX = 4;

	public static final int[] KEY_LOCATION = new int[] {
		(int) (Math.random() * (X_MAX - 1)),
		(int) (Math.random() * (Y_MAX - 1))
	};

	@Override
	public void load(World world, Player player) {
		world.add(new Key(), KEY_LOCATION[0], KEY_LOCATION[1]);
		world.add(player, 1, 1);
		world.add(new Door(), 6, 5);
		world.add(new Wall(), 6, 4);
		world.add(new Wall(), 7, 4);
		world.add(new Enemy(), 7, 5);
	}

}
