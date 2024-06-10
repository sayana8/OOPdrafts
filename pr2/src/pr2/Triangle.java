package pr2;
import java.util.Scanner;

public class Triangle {
    private int width;

    public Triangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder triangle = new StringBuilder();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                triangle.append("[*]");
            }

            if (i < width) {
                triangle.append("\n");
            }
        }

        return triangle.toString();
    }
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for the triangle: ");
	        int nRows = scanner.nextInt();
	        
	        Triangle triangle = new Triangle(nRows);

	        System.out.println(triangle.toString());

	        scanner.close();
	    }
	}