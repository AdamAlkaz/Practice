import java.awt.Color;
import java.awt.Graphics;
public class Circle {
	Coordinate center; // A circle is defined by its color, radius and the top left corner of the bounding box for the circle
	Coordinate lastMousePosition;
	int radius;
	Color circleColor;
	boolean circleIsSelectedForMoving = false; // true if the user presses mouse button inside the circle
	boolean perimeterSelected = false; // true if the user presses mouse button on the perimeter of the circle

	public Circle(){
		center = new Coordinate(100, 100); // initial definition of the circle
		radius = 20;
		circleColor = Color.RED;
	}
	public void processMouseMotionEvent(Coordinate currentMousePosition){// called when the user drags the mouse
		if (circleIsSelectedForMoving){// If the circle is selected for moving
			updateCirclePosition(currentMousePosition); // Find new position of circle
		} else if (perimeterSelected){// if the perimeter of the circle is selected for modifying the size of circle
			updateCircleSize(currentMousePosition); // Find new radius of circle and update the size of circle
		}
	}
    public void processMouseReleasedEvent(Coordinate currentMousePosition){// called when the user releases the left mouse button
    	circleColor = Color.RED;              // the color becomes red again and all flags
		circleIsSelectedForMoving = false;             // are reset.
		perimeterSelected = false;
    }

	public void processMousePressedEvent(Coordinate currentMousePosition){// called when the user presses the left mouse button
		lastMousePosition = currentMousePosition;// save the current position of the button so that subsequent mouse drag event
		                                         // can be handled
		if (circleIsSelected(lastMousePosition)){ // If circle is selected
			circleIsSelectedForMoving = true;     // the corresponding flag is set to true and
			circleColor = Color.GREEN;            //the color of the circle becomes green
		}
		else if (onPerimeter(lastMousePosition)){ // If the user selects the circumference of the circle
			perimeterSelected = true;             // by pressing the mouse within 5 pixels of the perimeter
			                                      // the corresponding flag is set to true and
			circleColor = Color.BLUE;             // the color becomes blue
		}
	}

	private void updateCirclePosition(Coordinate newMousePosition){// This method is called when the user selects the circle
		                                                           // for moving and has then dragged the mouse
		int newXValue, newYValue; // gives the x value and the y value of the new center of the circle
		newXValue = center.getX() + newMousePosition.getX() - lastMousePosition.getX();
		newYValue = center.getY() + newMousePosition.getY() - lastMousePosition.getY();
		center = new Coordinate(newXValue, newYValue); // get the new position of center of circle
		lastMousePosition = newMousePosition; // get the new position of center of circle
	}

	private void updateCircleSize(Coordinate newMousePosition){// method is called to modify the size of circle
		int newXValue, newYValue;
		newXValue = newMousePosition.getX();
		newYValue = newMousePosition.getY();
		// The new radius is the new distance of the mouse from the center of the circle.
		radius = (int) Math.sqrt((double) ((center.getX() - newXValue)*(center.getX() - newXValue) +
                (center.getY() - newYValue)*(center.getY() - newYValue)));
	}

	private boolean  circleIsSelected(Coordinate point){// method is called to check if the user has pressed mouse button
		double distanceFromCenter; // within the circle - at least 5 pixels closer to the center
		distanceFromCenter = center.distance(point);
		if (distanceFromCenter < radius - 5) {
			return true;
		}
		else {
			return false;
		}
	}

	private boolean onPerimeter(Coordinate point){ // method is called to check if the user has pressed mouse button
		double distanceFromCenter; // within 5 pixels of perimeter
		distanceFromCenter = center.distance(point);
		if ((distanceFromCenter >= radius - 5) &&
				(distanceFromCenter <= radius + 5)) {
			return true;
		} else{
			return false;
		}
	}

	public void showCircle(Graphics g){	// display the cirle with the specified color, size and center
		g.setColor(circleColor);
		g.drawOval(center.getX() - radius, center.getY() - radius, 2*radius, 2*radius);
	}

}
