package pr33;

public class Triangle extends Shape {
	private int perimeter;
	
	public Triangle(Color color, int pos, int perimeter) {
		super(color, pos);
		this.perimeter = perimeter;
		
	}
	public int getperimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter=perimeter;
	}
	void draw() {
		// TODO Auto-generated method stub
		for (int i = 0; i < pos ; i++) {
            System.out.print(" ");}
		if(color == Color.RED) { 
			System.out.println("\u001B[31m" +  "<>" + "\u001B[0m");}
		else {
			System.out.println("()");
		}
	}
	}
	
