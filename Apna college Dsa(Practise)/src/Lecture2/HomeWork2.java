package Lecture2;

import java.util.*;

public class HomeWork2 {
   public static void main(String[] agrs) {
	   
	
	   
	   /*
	    * Make a program that takes the radius of a circle as input,
	    * calculates its radius and area and prints it as output to the user.
	    * 
	    */
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   int radius=scanner.nextInt();
	   
	   float pi=3.14f;
	   
	   float area= pi * (radius * radius);
	   System.out.println("area of circle : " + area);
   }
}
