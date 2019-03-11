/**
 * View: Contains everything about graphics and images
 * Know size of world, which images to load etc
 *
 * has methods to
 * provide boundaries
 * use proper images for direction
 * load images for all direction (an image should only be loaded once!!! why?)
 **/

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class View extends JPanel{
	  final int frameCount = 10;
	    int picNum = 0;
	    // added a second dimension to incorporate movement of animation
	    BufferedImage[][] pics;
	    int xloc = 0;
	    int yloc = 0;
	    final int xIncr = 8;
	    final int yIncr = 2;
	    final static int frameWidth = 500;
	    final static int frameHeight = 300;
	    final static int imgWidth = 165;
	    final static int imgHeight = 165;
	    String direction = "SE";
	    
	    public View(){
	    	
	    	//southeast direction picture
	    	BufferedImage img = createImage();
	    	pics = new BufferedImage[8][10];
	    	for(int i = 0; i < frameCount; i++)
	    		pics[0][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	//southwest direction picture
	    	direction = "SW";
	    	img= createImage();
	    	for (int i =0; i<frameCount; i++)
	    		pics[1][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	//northeast direction picture
	    	direction = "NE";
	    	img= createImage();
	    	for (int i =0; i<frameCount; i++)
	    		pics[2][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	//northwest direction picture
	    	direction = "NW";
	    	img= createImage();
	    	for (int i =0; i<frameCount; i++)
	    		pics[3][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	////north direction picture
	    	direction = "N";
	    	img= createImage();
	    	for (int i =0; i<frameCount; i++)
	    		pics[4][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	//south direction picture
	    	direction = "S";
	    	img= createImage();
	    	for (int i =0; i<frameCount; i++)
	    		pics[5][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	//east direction picture
	    	direction = "E";
	    	img= createImage();
	    	for (int i =0; i<frameCount; i++)
	    		pics[6][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	//west direction picture
	    	direction = "W";
	    	img= createImage();
	    	for (int i =0; i<frameCount; i++)
	    		pics[7][i] = img.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
	    	
	    	// TODO: Change this constructor so that at least eight orc animation pngs are loaded
	    }  
	    
	    //Read image from file and return
	    private BufferedImage createImage(){
	    	BufferedImage bufferedImage;
	    	try {
	    		//southeast image
	    		if(direction.contentEquals("SE")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_southeast.png"));
	        		return bufferedImage;
	    		}
	    		//southwest image
	    		else if(direction.contentEquals("SW")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_southwest.png"));
	        		return bufferedImage;
	    		}
	    		//northeast image
	    		else if(direction.contentEquals("NE")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_northeast.png"));
	        		return bufferedImage;
	    		}
	    		//northwest image
	    		else if(direction.contentEquals("NW")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_northwest.png"));
	        		return bufferedImage;
	    		}
	    		
	    		//north image
	    		else if(direction.contentEquals("N")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_north.png"));
	        		return bufferedImage;
	    		}
	    		
	    		//south image
	    		else if(direction.contentEquals("S")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_south.png"));
	        		return bufferedImage;
	    		}
	    		
	    		//east image
	    		else if(direction.contentEquals("E")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_east.png"));
	        		return bufferedImage;
	    		}
	    		
	    		//west image
	    		else if(direction.contentEquals("W")) {
	    			bufferedImage = ImageIO.read(new File("src/orc_animation/orc_forward_west.png"));
	        		return bufferedImage;
	    		}
	    		
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    	return null;
	    	
	    	// TODO: Change this method so you can load other orc animation bitmaps
	    }
}