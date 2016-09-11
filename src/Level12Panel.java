import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level12Panel extends SplashScreen {
	
	public Level12Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.RED);
   
    JLabel lab1 = new JLabel("LEVEL 12) Key to Success");
    JLabel lab2 = new JLabel("OBJECTIVE: They key is located in a random position in the prison. Find it to unlock the door!");
    JLabel lab3 = new JLabel("HINT: X Location is LEVEL12.KEY_LOCATION[0] while Y Location is LEVEL12.KEY_LOCATION[1]");
    lab2.setFont(new Font("Serif", Font.PLAIN, 20));
    lab3.setFont(new Font("Serif", Font.PLAIN, 20));

    
    lab1.setForeground(Color.WHITE);
    lab1.setFont(new Font("Serif", Font.PLAIN, 30));
    p.setLayout(new BorderLayout()); 
    p.add(lab1, BorderLayout.PAGE_START);
    p.add(lab2, BorderLayout.LINE_START);
    p.add(lab3, BorderLayout.PAGE_END);
    

    add(p);
	}

public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.getContentPane().add(new Level12Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}