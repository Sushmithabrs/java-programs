
package Arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String name="race";
		String name1="care";
		
		char[] c1=name.toCharArray();
		char[] c2=name1.toCharArray();
		//System.out.println(Arrays.toString(c1));
		//System.out.println(Arrays.toString(c2));
		  Arrays.sort(c1);
		  System.out.println("After sorting c1 :"+Arrays.toString(c1));
		  Arrays.sort(c2);
		  System.out.println("After Sorting c2:"+Arrays.toString(c2));
		  
		boolean b1=Arrays.equals(c1, c2);
		if(b1==true) {
			System.out.println("they are anagram");
		}
		else {
			System.out.println("they are not anagram");
			
		}
	}

}
