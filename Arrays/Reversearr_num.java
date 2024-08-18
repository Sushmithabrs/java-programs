package Arrays;

import java.util.Arrays;

public class Reversearr_num 
{

	public static void main(String[] args) 
	{
		int[] a=new int[3];
		a[0]=1;
		a[1]=30;
		a[2]=40;
		int[] b=new int[3];
		System.out.println(Arrays.toString(a));
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
		
			 b[j]=a[i];
			   j++;
		}
		System.out.println(Arrays.toString(b));
		
	}
}
