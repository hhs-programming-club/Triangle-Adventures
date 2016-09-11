public class Level1 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 2);
		world.add(new Enemy(), 4, 2);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel1(player);
	}

}
