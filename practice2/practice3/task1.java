package practice1;

import java.util.Scanner;


public class task1 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String myName = in.nextLine();
		
		for(int i=0; i<=myName.length()+1; ++i) {
			if(i==0) {
				System.out.print("+");
			}
			else if(i==myName.length()+1) {
				System.out.print("+\n");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.println("|" + myName + "|");
		for(int i=0; i<=myName.length()+1; ++i) {
			if(i==0) {
				System.out.print("+");
			}
			else if(i==myName.length()+1) {
				System.out.print("+\n");
			}
			else {
				System.out.print("-");
			}
		}
		
	}
}
