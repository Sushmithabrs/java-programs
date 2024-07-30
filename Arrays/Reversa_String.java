package Arrays;

public class Reversa_String {

	public static void main(String[] args) {
		String input="sushmitha";
		String output="";
		for(int i=input.length()-1;i>=0;i--){
		char c1=input.charAt(i);
		output=output+c1;
		//System.out.println(output);
		}
		System.out.println(output);
		}	
	}


