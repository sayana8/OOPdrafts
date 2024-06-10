package laba1;

import java.util.Scanner;

public class Analyzer {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Data data = new Data();

     while (true) {
         System.out.print("Enter number (Q to quit): ");
         if (sc.hasNextDouble()) {
             double value = sc.nextDouble();
             data.addValue(value);
         } else {
             String input = sc.next();
             if (input.equalsIgnoreCase("Q")) {
                 break; 
             } else {
                 System.out.println("Error. Please enter a number or 'Q' to quit.");
             }
         }
     }

     System.out.println("Average = " + data.getAverage());
     System.out.println("Maximum = " + data.getMaximum());
     
     sc.close();
 }
}