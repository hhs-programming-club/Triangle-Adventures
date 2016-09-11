public class Level8 implements Level {

	public static final int DISTANCE = (int) (Math.random() * 5);

	@Override
	public void load(World world, Player player) {
		world.add(player, 2, 3);
		world.add(new Enemy(), 3 + DISTANCE, 3);
	}

}
