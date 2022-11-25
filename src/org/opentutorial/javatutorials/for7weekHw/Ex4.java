package org.opentutorial.javatutorials.for7weekHw;

import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.*;
import javax.swing.*;

public class Ex4 extends JFrame {
	public Ex4(){
		
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i =0; i<10; i++) {
			Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA, 
					Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
			JButton  b= new JButton((i+1)+"");
			c.add(b);
			b.setBackground(col[i]);
		}
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex4();
	}

}
