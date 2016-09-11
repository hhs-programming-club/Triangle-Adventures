import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Main {

	public static final int STEP = 500;

	private JFrame frame;
	private JPanel cardPanel;

	public Main() {
	}

	public void run() {
		final World world = new World();
		final Player player = new Player();
		final Gui gui = new Gui(world);
				
		// change gui mode to DARK or LIGHT
		gui.setMode(gui.DARK);

		final Level level = Levels.levels[Gameplay.LEVEL_NUMBER - 1];
		level.load(world, player);

		frame = showGui(gui);
		startLoop(world, gui);
		level.runPlayerCommands(player);
	}

	@SuppressWarnings("serial")
	public JFrame showGui(final Gui gui) {
		return new JFrame("Triangle Adventures") {
			{
				add(gui);
				pack();
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
			}
		};
	}

	public void startLoop(final World world, final Gui gui) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (world.isActive()) {
					gui.repaint();

					try {
						Thread.sleep(STEP);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

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
