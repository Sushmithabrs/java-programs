package Arrays;

import java.util.Arrays;

//Write a program to find out whitespaces, 
//numeric values and special characters in a given  string (Eg: Name123, 50cents) 
public class String_Whitespace {

	public static void main(String[] args) {
	int count_of_alpha=0;
	int count_of_numeric=0;
	int count_of_space=0;
	String input="Name123 @#%&";
	char c1[]=input.toCharArray();
	System.out.println(Arrays.toString(c1));
	for(int i=0;i<input.length();i++) {
	boolean b1=Character.isAlphabetic(c1[i]);
	boolean b2=Character.isDigit(c1[i]);
	boolean b3=Character.isWhitespace(c1[i]);
	if(b1==true) {
		 count_of_alpha++;
		
	}
	if(b2==true) {
		count_of_numeric++;
	}
	if(b3==true) {
		count_of_space++;
		
	}
}
	System.out.println("alphabets-"+count_of_alpha);
	System.out.println("numeric-"+count_of_numeric);
	System.out.println("space-"+count_of_space);
int count_of_specialcharacter=input.length()-(count_of_alpha+count_of_numeric+count_of_space);
System.out.println("specialcharacter-"+count_of_specialcharacter);
	}
}