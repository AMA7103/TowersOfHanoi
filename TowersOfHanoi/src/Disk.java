//imports
import java.awt.Color;
import objectdraw.*;


public class Disk extends ActiveObject{
	//instance variables
	private int size;
	private Color color;
	private boolean isTop;
	private FilledRect disk;
	private Post post;
	
	//constructor
	
	public Disk(double x, double y, double width, double height, DrawingCanvas c, int size, Color color, Post post) {
		//making the rectangle
		disk = new FilledRect(x, y, width, height, c);
		
		//declaring variables
		this.size= size;
		this.color = color;
		this.post = post;
	}
	
	public void toggleIsTop() {
		
		isTop = !isTop;
		//setting isTop to opposite
	}
	
	public boolean checkTop() {
		
		//boolean accessor method
		return isTop;
	}
	
	public void changePost(Post[] postArray, int postNumber) {
		
		//changing the post
		post = postArray[postNumber];
	}
	
	//Asking the WindowController where the mouse is
	public void followCursor(double mouseX, double mouseY) {
		
		//moving the disk
		disk.moveTo(mouseX, mouseY);
	}
}
