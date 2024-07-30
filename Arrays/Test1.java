package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*an array of 4 size store four values in 
 * it from human input and consider those 
 * 4 values are the 4 length of the rectangle.
Please a logic to find out the area for 
the same[write the program in eclipse and copy paste the program here]*/
public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int arrsize=sc.nextInt();
int[] a=new int[arrsize];
 int sum=0;
for(int i=0;i<=arrsize-1;i++) {
	System.out .println("enter the array values"+i);
	a[i]=sc.nextInt();
	sum=sum+a[i];
}

System.out.println(Arrays.toString(a));
System.out.println("area of rectangle"+sum);
	}

}
