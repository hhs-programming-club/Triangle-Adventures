import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level10Panel extends SplashScreen {
	
	public Level10Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.YELLOW);
   
    JLabel lab1 = new JLabel("LEVEL 10) Breaking Barriers");
    JLabel lab2 = new JLabel("OBJECTIVE: Find the key, go through the door, and kill the circle");
    JLabel lab3 = new JLabel("HINT: The variable to use are KEY_LOC, DOOR_LOC, AND ENEMY_LOC.");
    JLabel lab4 = new JLabel("These are integer arrays meaning they are sets of multiple integers. ");
    JLabel lab5 = new JLabel("In this case, KEY_LOC[0] represents the x-value and KEY_LOC[1] represents they y-value");
    lab2.setFont(new Font("Serif", Font.PLAIN, 20));
    lab3.setFont(new Font("Serif", Font.PLAIN, 20));
    lab4.setFont(new Font("Serif", Font.PLAIN, 20));
    lab5.setFont(new Font("Serif", Font.PLAIN, 20));

    
    lab1.setForeground(Color.BLACK);
    lab1.setFont(new Font("Serif", Font.PLAIN, 30));
    p.setLayout(new BorderLayout()); 
    p.add(lab1, BorderLayout.PAGE_START);
    p.add(lab2, BorderLayout.LINE_START);
    p.add(lab3, BorderLayout.PAGE_END);
    p.add(lab4, BorderLayout.PAGE_END);
    p.add(lab5, BorderLayout.PAGE_END);
    

    add(p);
	}

public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.getContentPane().add(new Level10Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}