package lab2Dog;

import java.awt.Color;

public class Legs {

	public void drawAt(int x, int y, int height, int width) {
		// TODO Auto-generated method stub
		
		Drawing.g.setColor(Color.GRAY);
		Drawing.g.fillRect(x, y, width, height);
		Drawing.g.fillRect(x + width * 2, y, width, height);
		Drawing.g.fillRect(x, y + height * 2, width, height);
		Drawing.g.fillRect(x + width * 2, y + height * 2, width, height);
		
	}

}
