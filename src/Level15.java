<<<<<<< HEAD
<<<<<<< HEAD
public class Level15 implements Level {

	private static final int RAND = (int) (Math.random() * 6);
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

		world.add(player, 0, 3);
		world.add(new Enemy(), ENEMY_X, ENEMY_Y);
	}

}
=======
public class Level14 implements Level {
=======
public class Level15 implements Level {
>>>>>>> origin/master

	public void load(World world, Player player) {
		
		for (int i=0; i<8; i++) {
			for (int j=0; j<5; j++) {
				if (Math.random() < 0.8)
					world.add(new Key(), i, j);
				else
					world.add(new Wall(), i, j);
			}
		}
		world.add(player, 0, 0);
		
		world.add(new Door(), 6, 5);
		world.add(new Wall(), 6, 4);
		world.add(new Wall(), 7, 4);
		world.add(new Enemy(), 7, 5);	
	}
	
}
>>>>>>> origin/master
