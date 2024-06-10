package pr33;

public class Rectangle extends Shape {
	private int a;
	private int b ;
	
	public Rectangle(Color color, int pos, int a, int b) {
		super(color, pos);
		this.a=a;
		
		this.b=b;
		
		}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void draw() {
		for (int i = 0; i < pos ; i++) {
            System.out.print(" ");}
		if(color == Color.RED) { 
		System.out.println("\u001B[31m" +  "[]" + "\u001B[0m");}
		else {
			System.out.println("()");
		}
		
	}

}
