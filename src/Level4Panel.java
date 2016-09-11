import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level4Panel extends SplashScreen {
	
	public Level4Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.GREEN);
   
    JLabel lab1 = new JLabel("LEVEL 4) Don't Be Square");
    JLabel lab2 = new JLabel("OBJECTIVE: Navigate through the square walls and slaughter the circle");
    JLabel lab3 = new JLabel("HINT: Only 10 lines of code needed, don't overthink!");
    lab2.setFont(new Font("Serif", Font.PLAIN, 30));
    lab3.setFont(new Font("Serif", Font.PLAIN, 30));

    
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
    frame.getContentPane().add(new Level4Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}