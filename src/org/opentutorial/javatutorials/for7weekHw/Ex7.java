package org.opentutorial.javatutorials.for7weekHw;

import java.awt.*;

import javax.swing.*;

public class Ex7 extends JFrame{
	public Ex7() {
		setSize(300,300);
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		JPanel input =  new JPanel();
		JPanel buttons =  new JPanel();
		JPanel result =  new JPanel();
		
		input.setBackground(Color.LIGHT_GRAY);
		JLabel text = new JLabel("수식입력");
		JTextField tf1 = new JTextField(10);
		input.add(text);
		input.add(tf1);
		
		result.setBackground(Color.LIGHT_GRAY);
		JLabel text1 = new JLabel("계산결과");
		JTextField tf2 = new JTextField(10);
		result.add(text1);
		result.add(tf2);
		
		
		
		buttons.setLayout(new GridLayout(4,4));
		for(int i =0; i<16; i++) {
			JButton b= new JButton();
			String[] str = {"CE", "Enter", "+","-","x","/"};
			buttons.add(b);
			if(i<10) {
				b.setText(i+"");
			}else {
				b.setText(str[i-10]);
			}
			if(i>11)
				b.setBackground(Color.yellow);
		}
		
		c.add(input,BorderLayout.NORTH);
		c.add(buttons,BorderLayout.CENTER);
		c.add(result,BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex7();
	}

}
