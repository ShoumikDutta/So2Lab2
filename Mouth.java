package lab2Dog;

import java.awt.Color;

public class Mouth {
	private Teeth teeth;
	
	public Mouth()
	{
		teeth= new Teeth();
		
	}

	public void drawAt(int x, int y, int height, int width) {
		// TODO Auto-generated method stub
		Drawing.g.setColor(Color.pink);
		Drawing.g.fillRect(x, y, width, height);
		teeth.drawAt(x, y, height, width);
		
	}

}
