package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Board extends JPanel {	//extend there so it uses JPanel crap

	public Board(){
		
		super();	//references super class from JPanel
		this.setLayout(null);	//Disabling layout manager again for everything inside window
		this.setBackground(Color.BLUE);	//filling in Window with blue
		this.setBounds(0, 0, 500, 500);	//Setting the bounds how the interior of the window is.
		this.requestFocus();	//things inside Window requesting focus
		this.addMouseListener(new MouseAdapter(){

			public void mouseClicked(MouseEvent arg0) {
			System.out.println("lol fat facee, I can't type.");
				
			}


			
		});
			
	}
	
	public void paint(Graphics g){
		
		super.paint(g);
		
	}
	
}
