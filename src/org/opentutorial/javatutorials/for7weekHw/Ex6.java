package org.opentutorial.javatutorials.for7weekHw;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex6 extends JFrame {

	public Ex6() {
		setSize(300,300);
		setTitle("Random Lables");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i =0; i<20; i++) {
			int x =(int)(Math.random()*200)+50;
			int y =(int)(Math.random()*200)+50;
			
			JLabel label = new JLabel();
			label.setBackground(Color.blue);
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setOpaque(true);
			c.add(label);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex6();
	}

}
