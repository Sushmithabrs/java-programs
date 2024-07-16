package program;

import java.util.Scanner;

public class Areaof_Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// System.out.println("please enter the i value  value");
			int i=2;
		 System.out.println("please enter the b value");
		 int b=sc.nextInt();
		 System.out.println("please enter the h value");
		 int h=sc.nextInt();
		double Triangle=i*b*h;
		  System.out.println("enter the area of Triangle :"+Triangle);  
		sc.close();
	}

}
