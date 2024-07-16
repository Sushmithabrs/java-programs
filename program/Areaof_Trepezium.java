package program;

import java.util.Scanner;

public class Areaof_Trepezium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double i=0.5;
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("enter the value of h:");
		int h=sc.nextInt();
		double P=i*(a+b)*h;
		System.out.println("Areaof_Trepeziu:"+P);
		
		sc.close();
	}

}
