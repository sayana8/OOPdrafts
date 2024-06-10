package pr33;
import java.util.Vector;


public class ShapeTest {
	public static void main(String[] args) {
		Vector<Shape> shapes = new 	Vector<Shape>();
		shapes.add(new Circle(Color.BLACK, 15, 4.5 ));
		shapes.add(new Rectangle(Color.RED, 25, 5, 6 ));
		shapes.add(new Circle(Color.BLACK, 0, 6.0));
		shapes.add(new Triangle(Color.RED, 10 ,  25));
		shapes.add(new Triangle(Color.BLACK,7,  46));
	for(Shape s : shapes) {
		s.draw();
		
	}
	System.out.println("");
	}

}

