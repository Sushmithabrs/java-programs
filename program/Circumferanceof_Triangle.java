package program;

import java.util.Scanner;

public class Circumferanceof_Triangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the A value:");
	int a=sc.nextInt();
	System.out.println("enter the B value:");
	int b=sc.nextInt();
	System.out.println("enter the c value:");
	int c=sc.nextInt();
	int p=a+b+c;
	System.out.println("the Circumferanceof Triangle is:"+p);
   sc.close();
	}

}
