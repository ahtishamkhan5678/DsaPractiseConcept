package Lecture4;

import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int a =sc.nextInt();
		
		if(a%1==0 && a%a==0 && a%2!=0 && a%3!=0) {
			System.out.println("Prime Num");
		}
		else {
			System.out.println("Not Prime Num");
		}
	}

}
