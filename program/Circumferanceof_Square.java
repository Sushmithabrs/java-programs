package program;

import java.util.Scanner;

public class Circumferanceof_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enter the Length value:");
		int l=sc.nextInt();
		System.out.println("Enter the width value:");
		int w=sc.nextInt();
		int i=2;
		int p=i*(l+w);
		System.out.println("Circumferanceof_Square:"+p);
		}

}
