import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level9Panel extends SplashScreen {
	
	public Level9Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.YELLOW);
   
    JLabel lab1 = new JLabel("LEVEL 9) Unpredictable Walls");
    JLabel lab2 = new JLabel("OBJECTIVE: Using the variable, wallLength, kill the circle in the room");
    JLabel lab3 = new JLabel("HINT:The variable is called Level9.WALL_LENGTH ");
    lab2.setFont(new Font("Serif", Font.PLAIN, 30));
    lab3.setFont(new Font("Serif", Font.PLAIN, 30));

    
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
    frame.getContentPane().add(new Level9Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}