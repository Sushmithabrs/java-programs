package Arrays;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
	/*	String name="sushmitha";
		String output=" ";
		for(int i=name.length()-1;i>=0; i-- ){
		char c1=name.charAt(i);
		
		
		output=output+c1;
		}
		System.out.print(output));

	}

}*/

int count_of_alpha=0;
String name="world is full of beautiful people";
char c1[]=name.toCharArray();
//Arrays.sort(c1);
System.out.println(Arrays.toString(c1));
for(int i=0;i<name.length();i++){//c.length also
	boolean b1=Character.isAlphabetic(c1[i]);
	if(b1==true) {
		count_of_alpha++;
		
	}
	//Arrays.sort(c1);
	
	}
//Arrays.sort(c1);
	System.out.println(count_of_alpha);
	//Arrays.sort(c1);
	System.out.println(c1);
	}}
