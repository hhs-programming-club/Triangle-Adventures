public class Level2 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 2);
		world.add(new Enemy(), 6, 4);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel2(player);
	}

}
