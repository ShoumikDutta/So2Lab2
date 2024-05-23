package lab2Dog;

import java.awt.Color;

public class Head implements brownHead{
	private Mouth mouth;
	private Nose nose;
	private Eyes eyes;
	private Ears ears;
	private int n,height,width;
	private int mouthWidth,mouthHeight;
	private int earWidth,earHeight;
	private int eyeWidth,eyeHeight;
	private int noseWidth,noseHeight;

	public Head(int height, int width) {
		// TODO Auto-generated constructor stub
		this.n=n;
		this.height=height*n;
		this.width=width*n;
		mouth=new Mouth();
		nose=new Nose();
		eyes=new Eyes();
		ears=new Ears();
	}

	public void drawAt(int headX, int headY, int headHeight, int headWidth) {
		// TODO Auto-generated method stub
		Drawing.g.setColor(Color.black);
		Drawing.g.fillOval(headX, headY, headHeight, headWidth);
		
		mouthWidth = headWidth / 2;
		mouthHeight = headHeight / 4;
        mouth.drawAt(headX + (headWidth / 4), headY + (3 * headHeight / 4), mouthWidth, mouthHeight);

        // Draw ears
        earWidth = headWidth / 4;
        earHeight = headHeight / 4;
        ears.drawAt(headX, headY, earWidth, earHeight);
        ears.drawAt(headX + (3 * headWidth / 4), headY, earWidth, earHeight);

        // Draw eyes
        eyeWidth = headWidth / 8;
        eyeHeight = headHeight / 8;
        eyes.drawAt(headX + (headWidth / 4), headY + (headHeight / 4), eyeWidth, eyeHeight);
        eyes.drawAt(headX + (2 * headWidth / 4), headY + (headHeight / 4), eyeWidth, eyeHeight);

        // Draw nose
        noseWidth = headWidth / 8;
        noseHeight = headHeight / 8;
        nose.drawAt(headX + (3 * headWidth / 8), headY + (headHeight / 2), noseWidth, noseHeight);
		
	}

	public void drawAt(int headX, int headY, int headHeight, int headWidth, Color C) {
		// TODO Auto-generated method stub
		Drawing.g.setColor(C);
		Drawing.g.fillOval(headX, headY, width, height);
		
		mouthWidth = headWidth / 2;
		mouthHeight = headHeight / 4;
        mouth.drawAt(headX + (headWidth / 4), headY + (3 * headHeight / 4), mouthWidth, mouthHeight);

        // Draw ears
        earWidth = headWidth / 4;
        earHeight = headHeight / 4;
        ears.drawAt(headX, headY, earWidth, earHeight);
        ears.drawAt(headX + (3 * headWidth / 4), headY, earWidth, earHeight);

        // Draw eyes
        eyeWidth = headWidth / 8;
        eyeHeight = headHeight / 8;
        eyes.drawAt(headX + (headWidth / 4), headY + (headHeight / 4), eyeWidth, eyeHeight);
        eyes.drawAt(headX + (2 * headWidth / 4), headY + (headHeight / 4), eyeWidth, eyeHeight);

        // Draw nose
        noseWidth = headWidth / 8;
        noseHeight = headHeight / 8;
        nose.drawAt(headX + (3 * headWidth / 8), headY + (headHeight / 2), noseWidth, noseHeight);
		
	}

}
