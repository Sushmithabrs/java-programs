
package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry_Catch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String name=sc.next();
	try {
    System.out.println("enter the age");
	int age=sc.nextInt();
	System.out.println(age);
	}
	catch(InputMismatchException e3) {
		System.out.println("enter the age in numbers");
	}
	
	try {
	System.out.println("enter the phone number");
	long pno=sc.nextLong();
	System.out.println(pno);
	}
	catch(InputMismatchException e) {
		System.out.println("enter the number values");
		try {
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the phone number");
			long pno=sc1.nextLong();
			System.out.println(pno);
			
		}
		catch(InputMismatchException e1) {
			System.out.println("plese enter pno");
		}
	
	}
	System.out.println("enter the gender");
	String gender=sc.next();
	System.out.println(name);
    System.out.println(gender);
	

	}

}
