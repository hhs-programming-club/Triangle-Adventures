import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level11Panel extends SplashScreen {
	
	public Level11Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.RED);
   
    JLabel lab1 = new JLabel("LEVEL 11) Don't Get Dizzy");
    JLabel lab2 = new JLabel("OBJECTIVE: Try and reach the circle by following the pattern(N-1, N-2, N-3)");
    JLabel lab3 = new JLabel("HINT: The variable Level11.N tells you how many 'sections' the maze has. Use the nested for loop.");
    lab2.setFont(new Font("Serif", Font.PLAIN, 25));
    lab3.setFont(new Font("Serif", Font.PLAIN, 25));

    
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
    frame.getContentPane().add(new Level11Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}