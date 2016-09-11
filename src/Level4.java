public class Level4 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 2);
		world.add(new Wall(), 3, 2);
		world.add(new Enemy(), 5, 2);
	}

}
