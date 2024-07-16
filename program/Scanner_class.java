package program;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the name");
		String Name=sc.next();
		System.out.println("please enter the Email ");
		String Email=sc.next();
		System.out.println("please enter the password");
		String Pasword=sc.next();
		System.out.println("please enter the gender");
		String Gender=sc.next();
		System.out.println("please enter the presentaddres");
		String Present_address=sc.nextLine();
		System.out.println("please enter the Permanentaddress");
		String Parmanent_addres=sc.nextLine();
		System.out.println("please enter the pincode");
        int Picode=sc.nextInt()	;
        System.out.println("Thank you");
    	sc.close();
        }
	

}
