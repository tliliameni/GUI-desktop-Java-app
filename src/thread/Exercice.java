package thread;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercice extends JFrame {
	Canvas cv=new Canvas();
	JButton G=new JButton("G");
	JButton D=new JButton("D");
	JButton H=new JButton("H");
	JButton B=new JButton("B");
	JButton stop=new JButton("stop");
	
	Pocmanthread pc;
	public Exercice() {
		super("Exercice");
	    setSize(500,400);
	    JPanel pbutt=new JPanel(new GridLayout(3,3));
	    pbutt.add(new JLabel());pbutt.add(H);pbutt.add(new JLabel());
	    pbutt.add(G);pbutt.add(stop);;pbutt.add(D);
	    pbutt.add(new JLabel());pbutt.add(B);pbutt.add(new JLabel());
	    Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add("Center",cv );
		c.add("South", pbutt);
		
		cv.setBackground(Color.black);
		
		
		setVisible(true);
		
		pc=new Pocmanthread(this);
		G.addActionListener(e->pc.orientation="G");
		D.addActionListener(e->pc.orientation="D");
		H.addActionListener(e->pc.orientation="H");
		B.addActionListener(e->pc.orientation="B");
		stop.addActionListener(e->pc.start());
		
		
    
	}
}
