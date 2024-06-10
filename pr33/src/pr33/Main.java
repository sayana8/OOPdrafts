package pr33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter the number of times that lion has to make 'rrrrr' sound:  ");
    	
    	int numberOfTimes = sc.nextInt();
    	
        Lion lion = new Lion("Simba", "male", 5, "zoo");
        Lion lion2 = new Lion("Arystan" , "male" ,7, "savanna");

        lion.eat();
        lion.makeSound();
        lion2.makeSound();
        lion.makeSound(numberOfTimes);
        lion.sleep();
        
    }
}
