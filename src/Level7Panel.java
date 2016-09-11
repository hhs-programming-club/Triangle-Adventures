import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level7Panel extends SplashScreen {
	
	public Level7Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.YELLOW);
   
    JLabel lab1 = new JLabel("LEVEL 7) Cleaning Up");
    JLabel lab2 = new JLabel("OBJECTIVE: You have received a secret code (an integer). If the message is '1', attack the circle in front of you. If it is '0' attack the one behind you.");
    JLabel lab3 = new JLabel("HINT:Variable is called Level7.CODE. Use If statements to check what value is in the variable");
    lab2.setFont(new Font("Serif", Font.PLAIN, 15));
    lab3.setFont(new Font("Serif", Font.PLAIN, 20));

    
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
    frame.getContentPane().add(new Level7Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}