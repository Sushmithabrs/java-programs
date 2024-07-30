package Arrays;

import java.util.InputMismatchException;

public class Try_Catch {

	public static void main(String[] args) {
		try {
		int c=1/0;
		System.out.println(c);
		
	}
	catch(ArithmeticException a){
		System.out.println("i have handled the exception");
	}
	catch(InputMismatchException a) {
		System.out.println("i have handled the exception 2");
		}

}}
