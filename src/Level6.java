public class Level6 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 1);
		world.add(new Enemy(), 5, 3);

		for (int i = 0; i <= 7; i++) {
			world.add(new Wall(), i, 0);
		}

		for (int i = 0; i <= 6; i++) {
			world.add(new Wall(), i, 2);
		}

		world.add(new Wall(), 6, 3);

		for (int i = 1; i <= 6; i++) {
			world.add(new Wall(), i, 4);
		}
		
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel6(player);
	}

}
