package Arrays;

public class StringAlphabets {

	public static void main(String[] args) {
		String input="Sushmitha123";
		int ncount=0;
	    int ccount=0;
		boolean b1=false;
		char[] c1=input.toCharArray();
		System.out.println(input);
		for(int i=0;i<input.length();i++) {
		b1=Character.isAlphabetic(c1[i]);
		System.out.println(b1);
		if(b1){
			++ccount;
		}
		else
		{
			++ncount;
			
		}}
		System.out.println("Character"+ccount);
		System.out.println("number"+ncount);
		
		
		

	}

}
