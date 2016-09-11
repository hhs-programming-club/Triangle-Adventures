import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level13Panel extends SplashScreen {
	
	public Level13Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.RED);
   
    JLabel lab1 = new JLabel("LEVEL 13) Where is it?");
    JLabel lab2 = new JLabel("OBJECTIVE: We know you're tired. Find the shortest way to get to the circle.");
    JLabel lab3 = new JLabel("HINT: Player is located at Level13.PLAYER_X, Level13.PLAYER_Y. Enemy is located at Level13.PLAYER_X, Level13.PLAYER_Y ");
    lab2.setFont(new Font("Serif", Font.PLAIN, 20));
    lab3.setFont(new Font("Serif", Font.PLAIN, 15));

    
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
    frame.getContentPane().add(new Level13Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}