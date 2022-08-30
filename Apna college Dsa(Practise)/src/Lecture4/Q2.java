package Lecture4;

import java.util.*;

public class Q2 {
	public static void main(String[] agrs) {
		
		/*
		 * Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
         If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
         If they enter 0 then stop.
         If he/ she scores :
         Marks >=90 -> print “This is Good”
         89 >= Marks >= 60 -> print “This is also Good”
         59 >= Marks >= 0 -> print “This is Good as well”
	     Because marks don’t matter but our effort does.
         (Hint : use do-while loop but think & understand why)

		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
	
		
		if (a==1) {
			for(int j=1;j<=100;j++)
			   {			
				int KeepTakInp=sc.nextInt();
			
		
		 
				if(KeepTakInp>=90) {
					System.out.println("This is Good");
					
					
				}
			
				
				else if(KeepTakInp>=60) {
					System.out.println("This is also  Good");
					
					
				}
				
				
				else if(KeepTakInp>=0) {
					System.out.println("This is Good as well");
					
					
				}
			
			
			
			}
			
		}else if(a==0) {
			System.out.println("Stop!");
		}
		
		
		
		
		
	}

}
