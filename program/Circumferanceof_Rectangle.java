package program;

import java.util.Scanner;

public class Circumferanceof_Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=2;
		System.out.println("enter the value of l:");
		int l=sc.nextInt();
		System.out.println("enter the value of w:");
		int w=sc.nextInt();
		 l=i*l;
		 w=i*w;
		int p=l+w;
		System.out.println("Circumferanceof_Rectangle"+p);
		sc.close();
	}

}
