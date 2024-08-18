package Arrays;

import java.util.Arrays;

public class Concatination {

	public static void main(String[] args) {
		String fname="sushmitha ";
		String lname="BR";
		System.out.println(fname.concat("").concat(lname));
		String a="my name is sushmitha";
		String[] b=a.split(" ");
		System.out.println(Arrays.toString(b));

	}

}
