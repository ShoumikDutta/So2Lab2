package lab2Dog;

import java.util.ArrayList;

public class Scene {
	private ArrayList<Dog> dogs; // aggregate

    public Scene(int numDogs) {
        dogs = new ArrayList<>();
        for (int i = 0; i < numDogs; i++) {
            int x = RandomNumber.between(10, 300);
            int y = RandomNumber.between(10, 300);
            int width = RandomNumber.between(100, 200);
            int height = RandomNumber.between(100, 200);
            Dog newOne=new Dog(x,y,height,width);
            boolean intersectFound=false;
            for(Dog check: dogs) {
				intersectFound = intersectFound || check.intersects(newOne);
				if(intersectFound)
				{
					break;
				}
			}
            if(intersectFound)
            {
            	intersectFound=false;
            	i--;
            }
            else {
            	 dogs.add(new Dog(x, y, width, height));
            }
            	
            }
            
        }
        public void draw() {
            for (Dog dog : dogs) {
                dog.draw();
            }
}
