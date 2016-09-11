public class Level14 implements Level {

	private static final int RAND = (int) (Math.random() * 6);
	public static final int PLAYER_X = RAND < 3 ? 0 : 3;
	public static final int PLAYER_Y = RAND < 3 ? 3 : 1;
	public static final int ENEMY_X = new int[]{2, 1, 0}[RAND / 2];
	public static final int ENEMY_Y = new int[]{2, 0, 1}[RAND / 2];

	@Override
	public void load(World world, Player player) {
		world.add(new Wall(), 0, 0);
		world.add(new Wall(), 1, 1);
		world.add(new Wall(), 1, 2);
		world.add(new Wall(), 2, 1);
		world.add(new Wall(), 2, 3);
		world.add(new Wall(), 3, 3);
		world.add(new Wall(), 4, 3);

		world.add(player, PLAYER_X, PLAYER_Y);
		world.add(new Enemy(), ENEMY_X, ENEMY_Y);
	}

}
