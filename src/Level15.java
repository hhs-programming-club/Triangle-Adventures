public class Level15 implements Level {

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
