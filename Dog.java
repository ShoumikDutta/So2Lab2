package lab2Dog;

import java.awt.Color;
import java.awt.Point;

public  class Dog extends Animal implements LocatedRectangle{
	private int height, width,x,y;
	private int bodyX,bodyY,bodyHeight,bodyWidth;
	private int headX,headY,headHeight,headWidth;
	
	public Dog(int x,int y,int height,int width) {
		this.height=height;
		this.width=width;
		this.x=x;
		this.y=y;
		head=new Head(height/1, width/2);	
		body= new Body(height/2,width/2);
	}
	
	public void drawAt(int x, int y){
		bodyX = x + (width / 4);
        bodyY = y + (height / 4);
        bodyWidth = width / 2;
        bodyHeight = height / 2;
        headX = bodyX + (bodyWidth / 4);
        headY = bodyY - (bodyHeight / 2);
        headWidth = bodyWidth / 2;
        headHeight = bodyHeight / 2;
        head.drawAt(headX, headY, headHeight, headWidth);
		body.drawAt(bodyX, bodyY,bodyHeight,bodyWidth);
		
		
	}
	@Override
	public Point address() {
		return new Point(x, y);
	}

	@Override
	public int width() {
		return width;
	}

	public int length() {
		return height;
	}

	@Override
	public void draw() {
		this.drawAt(this.x, this.y);
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return height;
	}

}
