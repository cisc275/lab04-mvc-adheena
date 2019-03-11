import java.awt.Color;
import java.awt.Graphics;

/**
 * Model: Contains all the state and logic
 * Does not contain anything about images or graphics, must ask view for that
 *
 * has methods to
 *  detect collision with boundaries
 * decide next direction
 * provide direction
 * provide location
 **/
import "View.java";

public class Model{
	public void paint(Graphics g) {
    	picNum = (picNum + 1) % frameCount;
 
    	
    	//orc traveling southeast, x and y increase
    	if (direction.contentEquals("SE")) {
    		g.drawImage(pics[0][picNum], xloc+=xIncr, yloc+=yIncr, Color.gray, this);
    	}
    	//orc traveling southwest, x decreases and y increases
    	if (direction.contentEquals("SW")) {
    		g.drawImage(pics[1][picNum], xloc-=xIncr, yloc+=8, Color.gray, this);
    	}
    	//orc traveling northwest, x decreases and y decreases
    	if (direction.contentEquals("NW")) {
    		g.drawImage(pics[3][picNum], xloc-=xIncr, yloc-=8, Color.gray, this);
    	}
    	//orc traveling northeast, x increases and y decreases
    	if (direction.contentEquals("NE")) {
    		g.drawImage(pics[2][picNum], xloc+=xIncr, yloc-=2, Color.gray, this);
    	}
    	
    
    	
    	//if orc hits right wall, go southwest
    	if (((xloc+imgWidth) >= frameWidth)) {
    		direction = "SW";
    		
    	}
    	//if orc hits bottom wall, go northwest
    	if ((yloc+imgHeight) >= frameHeight){
    		direction = "NW";
    	}
    	//if orc hits left wall, go northeast
    	if ((xloc<=0)) {
    		direction = "SE";
    	}
    	//if orc hits top wall, go southwest
    	if((yloc<=0)){
    		direction = "SW";
    	}
    	
    	// TODO: Keep the orc from walking off-screen, turn around when bouncing off walls.
		//Be sure that animation picture direction matches what is happening on screen.
    }
}