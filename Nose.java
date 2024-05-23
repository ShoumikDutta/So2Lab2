package lab2Dog;

import java.awt.Color;

public class Nose {

	public void drawAt(int x, int y, int height, int width) {
		// TODO Auto-generated method stub
		Drawing.g.setColor(Color.BLACK);
        Drawing.g.fillOval(x, y, width, height); 
	}

}
