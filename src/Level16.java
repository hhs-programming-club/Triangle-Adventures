
public class Level16 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 0, 0);	
		world.add(new Door(), 7, 5);
		
		for (int i=0; i<8; i++) {
			world.add(new Wall(), 1, i);
		}
		world.add(new Key(), 1, (int)(Math.random()*(5-3))+3);
		
		world.add(new Wall(), 3, (int)(Math.random()*(5-3)+3));
		for (int i=0; i<8; i++) {
			world.add(new Wall(), 4, i);
		}
		world.add(new Key(), 4, (int)(Math.random()*(2)));

		for (int i=0; i<8; i++) {
			world.add(new Wall(), 6, i);
		}
		world.add(new Key(), 6, (int)(Math.random()*(5-3))+3);
		
	}

}
