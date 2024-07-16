package program;

import java.util.Scanner;

public class AreaOf_Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("please enter the l value  value");
			int l=sc.nextInt();
		 System.out.println("please enter the Intigervalue value");
		 int w=sc.nextInt();
		double rectangle=l*w;
		  System.out.println("enter the area of rectangle :"+rectangle);  
		sc.close();
			}

}
