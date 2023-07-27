package thread;

import java.awt.Color;
import java.awt.Graphics;

public class Pocmanthread extends Thread {
Exercice poc;
Graphics g;

String orientation="H";
int start1=0;
int alpha1=0;

int start2=0;
int alpha2=0;
public Pocmanthread(Exercice poc) {
	this.poc=poc;
	g=poc.cv.getGraphics();
	
	
	
}


public void run() {
	
	
	while(true) {System.out.println(orientation);
		g.setColor(Color.yellow);
		poc.cv.update(g);
		if(orientation.equals("H")) {
			start1=135;
			 alpha1=270;
			 start2=90;
			 alpha2=360;
	     
		}
		
		else if(orientation.equals("B")) {
			 start1=315;
			 alpha1=270;
			 start2=270;
			 alpha2=360;
		}
		else if(orientation.equals("D")) {
			start1=45;
			 alpha1=270;
			 start2=0;
			 alpha2=360;
		}
		else if(orientation.equals("G")) {
			start1=225;
			 alpha1=270;
			 start2=180;
			 alpha2=360;
		}
		
		g.fillArc(10, 10, 60, 60,start1 , alpha1);
		try {sleep(200);}catch(Exception e) {e.printStackTrace();}
		g.fillArc(10, 10, 60, 60, start2, alpha2);
		try {sleep(200);}catch(Exception e) {}
		
	}
}


}
