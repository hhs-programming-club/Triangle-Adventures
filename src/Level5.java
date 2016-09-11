public class Level5 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 3);
		world.add(new Wall(), 2, 3);
		world.add(new Wall(), 3, 2);
		world.add(new Wall(), 3, 4);
		world.add(new Enemy(), 3, 3);
	}

}
