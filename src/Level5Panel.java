import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level5Panel extends SplashScreen {
	
	public Level5Panel() {

    JPanel p = new JPanel();
    p.setSize(1000,1000);
    p.setBackground(Color.GREEN);
   
    JLabel lab1 = new JLabel("LEVEL 5) Running Circles..Around Squares");
    JLabel lab2 = new JLabel("OBJECTIVE: The circle is a coward and doesn't want to fight. Go around to kill it! ");
    JLabel lab3 = new JLabel("HINT: You can have code both inside and outside of loops ");
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
    frame.getContentPane().add(new Level5Panel());
    frame.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 150);
    frame.setVisible(true);

	}
}