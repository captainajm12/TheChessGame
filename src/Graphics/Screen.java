package Graphics;


import java.awt.Dimension;

import javax.swing.JFrame;

public class Screen {	//Creating window for game
	
	JFrame frame = new JFrame();	//creating instance of frame from JFrame
	Board board = new Board();
	
	public Screen(){	//Constructor
		//frame.setLayout(null);	//Disabling layout manager
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Setting it so when you click close button it closes everything by default
		//frame.setBounds(0, 0, 500, 500);	//setting bounds of the window
		board.setPreferredSize(new Dimension(500, 500));
		frame.add(board);	//instance of Board class being created
		frame.setFocusable(true);	//setting it so by default it is focused on
		frame.setTitle("The Chess game");	//sets title of window
		frame.pack(); //Packs everything down
		frame.setLocationRelativeTo(null);	//Sets location of window relative to crap
		frame.setVisible(true);	//making it so one can see the window pop up

	}
}
