
public class Level10 implements Level{
	public int[] KEY_LOC = new int[]{1 + (int)(Math.random() * ((2 - 1) + 1)), 0 + (int)(Math.random() * ((5 - 0) + 1))};
	public int[] DOOR_LOC = new int[]{3,2};
	public int[] ENEMY_LOC = new int[]{4 + (int)(Math.random() * ((7 - 4) + 1)), 0 + (int)(Math.random() * ((5 - 0) + 1))};

	@Override
	public void load(World world, Player player) {
		world.add(player, 0, 3);
		for(int i = 0; i < 6; i++){
			world.add(new Wall(), 3, i);
		}
		world.add(new Door(), 3, 2);
		world.add(new Key(), KEY_LOC[0], KEY_LOC[1]);
		world.add(new Enemy(), ENEMY_LOC[0], ENEMY_LOC[1]);
	}

}
