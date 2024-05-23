package lab2Dog;

import java.awt.Graphics;

public class Drawing {

	public static Graphics g = null;
	
	public static void set(Graphics g) {
		Drawing.g = g;
	}
	
	public static Graphics g() {
		return Drawing.g;
	}
}

