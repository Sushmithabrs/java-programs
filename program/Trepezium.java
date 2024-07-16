package program;

import java.util.Scanner;

public class Trepezium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the A value  value");
	     int A=sc.nextInt();
		 System.out.println("please enter the B value");
		 int B=sc.nextInt();
		 System.out.println("please enter the C value");
		 int C=sc.nextInt();
		 System.out.println("please enter the D value");
		 int D=sc.nextInt();
		 int AB=A*B;
		 int BC=B*C;
		 int CD=C*D;
		 int AD=A*D;
		double Trepezium=AB+BC+CD+AD;
		  System.out.println("enter the area ofTrepeziume :"+Trepezium);  
		sc.close();
	}

	}


