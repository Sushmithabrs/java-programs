package Arrays;
import java.util.Arrays;
//Assignment
import java.util.Scanner;

public class UsingDouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] num=new double[3];
		for(double i=0;i<3;i++) {
			System.out.println("enter the double values:"+i);
			double[i]=sc.nextDouble();
			
		}
		System.out.println(Arrays.toString(num));
		

	}

}
