package org.opentutorial.javatutorials.for7weekHw;

import java.awt.*;
import javax.swing.*;


class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		
		JLabel la = new JLabel("Hello");
		JLabel la2 = new JLabel("Love");
		JLabel la3= new JLabel("Java");
		la.setLocation(30,30);
		la3.setLocation(100,30);
		la2.setLocation(50,50);
		la.setSize(50,10);
		la2.setSize(50,10);
		la3.setSize(50,10);

		add(la);
		add(la2);
		add(la3);
	
	}
	
}

public class OpenChallenge extends JFrame{

	public OpenChallenge(){
		setSize(300,300);
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OpenChallenge();
	}

}
