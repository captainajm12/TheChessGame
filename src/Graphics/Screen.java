package Graphics;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Screen {	//Creating window for game
	
	JFrame frame = new JFrame();	//creating instance of frame from JFrame
	
	public Screen(){	//Constructor
		frame.setLayout(null);	//Disabling layout manager
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Setting it so when you click close button it closes everything by default
		frame.setBounds(0, 0, 500, 500);	//setting bounds of the window
		frame.add(new Board());	//instance of Board class being created
		frame.setLocationRelativeTo(null);	//Sets location of window relative to crap
		frame.setFocusable(false);	//setting it so by default it is focused on
		frame.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Key pressed");
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.setTitle("The Chess game");	//sets title of window
		frame.setVisible(true);	//making it so one can see the window pop up
		
	}
}
