package program;

import java.util.Scanner;

public class Circumfersance_Circle {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("please enter the int value  value");
			int a=sc.nextInt();
		 System.out.println("please enter the pi value");
		 double pi=sc.nextDouble();
		 System.out.println("please enter the r value");
		 double r=sc.nextInt();
			double Circle=a*pi*r;
		  System.out.println("enter the area of circle:"+Circle);  
		sc.close();
			}

	}
	


