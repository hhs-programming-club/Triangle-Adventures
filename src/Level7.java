public class Level7 implements Level {

	public static final int CODE = (int) (Math.random() * 2) + 1;

	@Override
	public void load(World world, Player player) {
		world.add(player, 2, 3);
		world.add(new Enemy(), (CODE == 1) ? 3 : 1, 3);
	}

}
