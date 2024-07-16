package program;

import java.util.Scanner;

public class Areaof_Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the pi value");
		double pi=sc.nextDouble();
		System.out.println("please enter the r value");
		int r=sc.nextInt();
		double area=pi*r*r;
	  System.out.println("enter the area of circle:"+area);  
	sc.close();
		}

}
