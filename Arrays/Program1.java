package Arrays;
//using scanner
import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] name=new String[1];
		System.out.println("enter the first name");
		name[0]=sc.next();
		String[] name1=new String[1];
		System.out.println("enter the second name");
		name1[0]=sc.next();
		System.out.println(Arrays.equals(name,name1));
		sc.close();

	}

}
