package Arrays;

//import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the string name");
		String s1=sc.next();*/
		String s1="madam";
		String output="";
		for(int i=s1.length()-1;i>=0;i--) {
			 char c1=s1.charAt(i);
			 output=output+c1;
			 }
			 if(s1.equals(output)) {
				 System.out.println("palindrom");
				 
			 }
			 else {
		System.out.println("not palindrom");

	}

}}
