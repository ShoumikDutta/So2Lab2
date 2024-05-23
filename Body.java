package lab2Dog;

import java.awt.Color;

public class Body  implements whiteBody{
	private Legs legs;
	private Tail tail;
	private int height, width;
	public Body(int height, int width) {
		// TODO Auto-generated constructor stub
		this.height=height;
		this.width=width;
		
	}

	public void drawAt(int x, int y, int height, int width) {
		// TODO Auto-generated method stub
		Drawing.g.setColor(Color.black);
		Drawing.g.fillOval(x, y, width, height);
		int legWidth = width / 8;
        int legHeight = height / 2;
        legs.drawAt(x, y + height, legWidth, legHeight);

        int tailWidth = width / 4;
        int tailHeight = height / 4;
        tail.drawAt( x - tailWidth, y + (height / 2), tailWidth, tailHeight);
		
	}

	public void drawAt(int x, int y, int height, int width, Color c) {
		// TODO Auto-generated method stub
		Drawing.g.setColor(c);
		Drawing.g.fillOval(x, y, width, height);
		int legWidth = width / 8;
        int legHeight = height / 2;
        legs.drawAt(x, y + height, legWidth, legHeight);

        int tailWidth = width / 4;
        int tailHeight = height / 4;
        tail.drawAt( x - tailWidth, y + (height / 2), tailWidth, tailHeight);
		
		
	}

}
