import java.awt.Color;
import javax.swing.JPanel;

public class SplashScreen extends JPanel {
	Main m;
	
	public SplashScreen() {
		super();
		setBackground(Color.WHITE);		
	}
	
	public void setMain (Main w) {
		m = w;
	}
	
	public void changePanel () {
		m.changePanel("2");
	}
}
