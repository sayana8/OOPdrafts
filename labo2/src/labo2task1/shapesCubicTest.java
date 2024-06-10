package labo2task1;
import java.util.Vector;

public class shapesCubicTest {
	public static void main(String[] args) {
		Vector <ShapesCubic> shapesVector = new Vector <ShapesCubic>();
		shapesVector.add(new Cube (5.0, 6.5, 8.0));
		shapesVector.add(new Cylinder(6, 10));
		shapesVector.add(new Sphere (10 , 5));
	
	for(ShapesCubic s : shapesVector) {
		 double area = s.findArea();
         double volume = s.findVolume();
         double curvedArea = s.curvedSurfaceArea();
         
         System.out.println("Area: " + area);
         System.out.println("Volume: " + volume);
         System.out.println("Curved Surface Area: " + curvedArea);
         
         System.out.println( " ");
         
	
		
	}
}
}
