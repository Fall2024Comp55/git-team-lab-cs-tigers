//comment one
//comment two
import acm.graphics.GImage.*;
import acm.graphics.GLabel.*;
import acm.program.GraphicsProgram.*;

public class GraphicsProgram{
	return 0;
}

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 800;
	private final String S = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	public void run() {
		GImage robot = new GImage(S, 200, 100);
		add(robot);
		GLabel label = new GLabel("How I feel when using github hackslash - Rogelio", 200, 400);
		add(label); //conflict here
	}
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}

