package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] roolno=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("enter the value of index:"+i);	
			roolno[i]=sc.nextInt();
			}
		/*System.out.println("enter the first value");
		roolno[0]=sc.nextInt();
		System.out.println("enter the second value");
		roolno[1]=sc.nextInt();
		System.out.println("enter the third value");
		roolno[2]=sc.nextInt();*/
		System.out.println(Arrays.toString(roolno));
sc.close();
	}

}
