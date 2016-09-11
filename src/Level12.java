public class Level12 implements Level {

	public static final int N = (int) (Math.random() * 4) + 4;
	boolean visited[][] = new boolean[8][8];
	int dir = 0;
	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};



	@Override
	public void load(World world, Player player) {
		int x = 0, y = 0;
		for(int l = 0; l < N; l++)
		{
			for(int steps = 0; steps < N -l; steps++)
			{
				x += dx[dir];
				y += dy[dir];
				visited[x][y] = true;
			}
			dir = (dir + 1) % 4;
			if(l == N - 1)
				world.add(new Enemy(), x, y);
		}
		for(int r = 0; r < 8; r++)
			for(int c = 0; c < 8; c++)
				if(!visited[r][c])
					world.add(new Wall(), r, c);
		world.add(player, 0, 0);

	}

}
