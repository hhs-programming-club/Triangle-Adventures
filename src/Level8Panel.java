import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level8Panel extends SplashScreen {
	
	public Level8Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.YELLOW);
   
    JLabel lab1 = new JLabel("LEVEL 8) Unpredictable Enemies");
    JLabel lab2 = new JLabel("OBJECTIVE: The circles are choosing their own randomized locations. Given an integer, distance, kill the one in front of you");
    JLabel lab3 = new JLabel("HINT: Variable is called Level8.DISTANCE. Try using for loops! ");
    lab2.setFont(new Font("Serif", Font.PLAIN, 18));
    lab3.setFont(new Font("Serif", Font.PLAIN, 18));

    
    lab1.setForeground(Color.BLACK);
    lab1.setFont(new Font("Serif", Font.PLAIN, 30));
    p.setLayout(new BorderLayout()); 
    p.add(lab1, BorderLayout.PAGE_START);
    p.add(lab2, BorderLayout.LINE_START);
    p.add(lab3, BorderLayout.PAGE_END);
    

    add(p);
	}

public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.getContentPane().add(new Level8Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}