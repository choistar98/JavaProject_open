package org.opentutorial.javatutorials.for7weekHw;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class Ex5 extends JFrame{
	
	public Ex5(){
		setTitle("4x4 Color Frame");
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		for(int i =0; i<16; i++) {
			Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA, 
					Color.GRAY, Color.PINK, Color.LIGHT_GRAY,Color.MAGENTA, 
					Color.GRAY, Color.PINK, Color.LIGHT_GRAY,Color.RED, Color.ORANGE, Color.YELLOW,};
			JButton  b= new JButton((i+1)+"");
			c.add(b);
			b.setBackground(col[i]);
		}
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex5();
	}

}
