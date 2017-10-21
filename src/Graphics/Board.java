package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {	//extend there so it uses JPanel crap
	
	BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
	//File pawn = new ();

	public Board(){
		
		super();	//references super class from JPanel
		this.setLayout(null);	//Disabling layout manager again for everything inside window
		this.setBackground(Color.WHITE);	//filling in Window with white
		this.setBounds(0, 0, 500, 500);	//Setting the bounds how the interior of the window is.
		this.requestFocus();	//things inside Window requesting focus
		Graphics g = image.getGraphics();
		
		for(int y = 0; y < image.getWidth(); y++){	//for loop that scans y for total height
			for (int x = 0; x < image.getWidth(); x++){	//for loop that scans x for total width
				if(y%2 == 1){	//what to do when found odd row
					if(x%2 == 1){	//what to do when found odd column
						g.setColor(Color.BLACK);	//What to do for every odd row
					}
					else{	//What to do for every even column
						g.setColor(Color.WHITE);
					}
				}
				else{	//What to do for even row 
					if(x%2 == 1){
						g.setColor(Color.WHITE);
					}
					else{	//What to do for every odd row
						g.setColor(Color.BLACK);
					}
				}
				g.drawRect(x, y, 1, 1);	//Draws the actual rectangle at x and y, the size of 1 by 1 pixel
			}
		}
		
		this.addMouseListener(new MouseAdapter(){ //adds mouse listener and makes it an adapter to this specific class

			public void mouseClicked(MouseEvent arg0) {	//checks if mouse is clicked
			System.out.println("lol fat face");	//line to be printed
				
			}


			
		});
			
	}
	
	public void paint(Graphics g){ //method to paint things to interior of window
		super.paint(g); //calls regular paint methods
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), 0, 0, image.getWidth(), image.getHeight(), this);
		//Starting from (0,0) gets total image width and height, then starting from (0,0) gets the width and height of each
		//individual square
		
	}
	public void pawn(){
		//pawn = ImageIO.read(Pawn_chessgame);
	}
	
}
