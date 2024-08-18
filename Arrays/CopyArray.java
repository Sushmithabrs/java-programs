package Arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
	int[] a=new int[3];
	a[0]=20;
	a[1]=30;
	a[2]=40;
	int b[]=new int[3];
	for(int i=0;i<3;i++) {
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	}

}
