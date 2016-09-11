public class Level3 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 3, 2);
		world.add(new Enemy(), 1, 2);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel3(player);
	}
	
}
