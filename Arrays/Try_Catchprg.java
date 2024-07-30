package Arrays;

import java.util.Arrays;

public class Try_Catchprg {

	public static void main(String[] args) {
		
		String a[]=new String[2];
		a[0]="Sushmitha";
		a[1]="supriya";
		try {
		a[2]="chethan";
		}
		catch(ArrayIndexOutOfBoundsException i) {
			
		}
		
		System.out.println(Arrays.toString(a));
	}

}
