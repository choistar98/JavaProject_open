package org.opentutorial.javatutorials.for7weekHw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex8 extends JFrame{
	
	Ex8(){
		setSize(300,300);
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		JPanel menu =  new JPanel();
		JPanel draw =  new JPanel();
		JPanel input =  new JPanel();
		
		menu.setBackground(Color.LIGHT_GRAY);
		JButton button1 = new JButton("열기");
		JButton button2 = new JButton("닫기");
		JButton button3 = new JButton("나가기");
		menu.add(button1);
		menu.add(button2);
		menu.add(button3);
		
		input.setBackground(Color.yellow);
		JButton button4 = new JButton("Word Input");
		JTextField text1 = new JTextField(10);
		input.add(button4);
		input.add(text1);
		
		
		
		draw.setLayout(null);
		for(int i =0; i<20; i++) {
			int x =(int)(Math.random()*200)+50;
			int y =(int)(Math.random()*200)+50;
			
			JLabel label = new JLabel("*");
			label.setLocation(x,y);
			label.setSize(20,20);
			label.setForeground(Color.red);
			label.setOpaque(true);
			draw.add(label);
		}
		c.add(menu,BorderLayout.NORTH);
		c.add(draw,BorderLayout.CENTER);
		c.add(input,BorderLayout.SOUTH);
		setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex8();
	}

}
