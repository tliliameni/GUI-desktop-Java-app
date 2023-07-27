package thread;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface extends JFrame {
	JButton b1=new JButton("count");	
	public Interface() {
    super("Interface");
    setSize(500,400);
    Container c=getContentPane();
    c.setLayout(new FlowLayout());
    c.add(b1);
    setVisible(true);
    B b=new B();
    b1.addActionListener(e->b.start());
	}
	/*void inc() {
		// TODO Auto-generated method stub
		
		for(long i=0;i<Long.MAX_VALUE;i++)
		{
			System.out.println("val="+i);	
		}
	}*/
	}

