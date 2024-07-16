package program;
import java.util.Scanner;

public class Conditional_Statment {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the element");
		 int a=sc.nextInt();
		
		if(a>=0) {
	System.out.println("the given number is possitive");
}
else {
	System.out.println("the given number is negative");
	
}
		sc.close();
	}

}
