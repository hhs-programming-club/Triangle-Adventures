import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Main {

	public static final int STEP = 500;

	private JFrame frame;
	private JPanel cardPanel;
	private SplashScreen splashPanel;

	public Main () {}

	public void run () {		
		
		final World world = new World();
		final Player player = new Player();
		final Gui gui = new Gui(world);

		// change the level number to change levels
<<<<<<< HEAD
<<<<<<< HEAD
		final Level level = new Level13();
=======
		final Level level = new Level16();
>>>>>>> origin/master
=======
		int currentLevel = 5; //eg setting this to 1 would be changing the level to level 1
		final Level level = Levels.levels[currentLevel - 1];
		splashPanel = Levels.levelSplashScreens[currentLevel - 1];
		
		splashPanel.setMain(this);
>>>>>>> origin/master
		level.load(world, player);

		frame = showGui(gui);
		startLoop(world, gui);

		commandPlayer(player);
	}

	public void commandPlayer (Player player) {
		// Player commands go here
		for(int i=0; i<6; i++){
			for(int j=0; j<7; j++){
				player.move();
			}
			player.turnRight();
		}
		

	}

	@SuppressWarnings("serial")
	public JFrame showGui(final Gui gui) {
		return new JFrame("Triangle Adventures") {{
			
			JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
			split.setTopComponent(splashPanel);
			split.setBottomComponent(gui);
			split.setDividerLocation(0.8);
		    
			add(split);
			
			pack();
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}};
	}

	public void changePanel(String panel) {
		((CardLayout)cardPanel.getLayout()).next(cardPanel);
		frame.requestFocus();
	}

	public void startLoop(final World world, final Gui gui) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (world.isActive()) {
					gui.repaint();

					try {
						Thread.sleep(STEP);
					} catch (InterruptedException e) { e.printStackTrace(); }

					world.step();
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		final Main m = new Main();
		m.run();
	}
}
