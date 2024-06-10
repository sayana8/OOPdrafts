package pr33;

public class Circle extends Shape{
	private double radius;
	
	public Circle(Color color, int pos, double radius) {
		super(color, pos);
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void draw() {
		for (int i = 0; i < pos ; i++) {
            System.out.print(" ");}
		if(color == Color.RED) { 
		System.out.println("\u001B[31m" +  "()" + "\u001B[0m");}
		else {
			System.out.println("()");
		}
		
}
}
