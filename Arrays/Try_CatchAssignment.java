package Arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_CatchAssignment {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the array size");
		try {
	   int arrsize=sc.nextInt();
	String[] str=new String[arrsize];
	System.out.println("please enter the array name");
	for(int i=0;i<arrsize;i++) {
		str[i]=sc.next();
		
	}}
	catch(InputMismatchException i) {
	System.out.println("please enter integervalues");
	}
	//System.out.println(Arrays.toString(str));
	}
}