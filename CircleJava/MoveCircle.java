import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MoveCircle  extends JFrame{
	Circle myCircle; // This is the object tat will keep information about a circle and support all services needed
	public MoveCircle(){
		super("showing circle");
		addMouseListener( new MouseAdapter(){
			public void mousePressed(MouseEvent e ){// when the mouse is pressed
				Coordinate currentMousePosition;
				int xValue, yValue;// extract the coordinates of the position where the event occurred
				xValue = e.getX();
				yValue = e.getY();
				currentMousePosition = new Coordinate(xValue, yValue);
				myCircle. processMousePressedEvent(currentMousePosition);// send a message to myCircle to handle the event
				repaint();
			}
			public void mouseReleased(MouseEvent e ){ // when the left mouse button is released
				Coordinate currentMousePosition;
				int xValue, yValue;// comments similar to mousePressed method
				xValue = e.getX();
				yValue = e.getY();
				currentMousePosition = new Coordinate(xValue, yValue);
				myCircle. processMouseReleasedEvent(currentMousePosition);
				repaint();
			}
		}
		);

		addMouseMotionListener( new MouseMotionAdapter(){
			public void mouseDragged( MouseEvent e ){ // when the mouse is dragged
				int xValue, yValue;// comments similar to mousePressed method
				Coordinate currentMousePosition;
				xValue = e.getX();
				yValue = e.getY();
				currentMousePosition = new Coordinate(xValue, yValue);
				myCircle. processMouseMotionEvent(currentMousePosition);
				repaint();
			}
		}
		);
		myCircle = new Circle();  // create the cirle
		setSize(275,300); // define the size of the window
		setVisible(true); // make the window visible
	}

	public void paint(Graphics g){ // called to display the circle
		super.paint(g);
		myCircle. showCircle(g); // invoke message on myCircle to display itself
	}
} 
