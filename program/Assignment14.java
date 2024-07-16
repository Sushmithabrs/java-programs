package program;
/*Write a program to calculate the area and 
circumference of a circle in different methods 
and then call them in the main method  */                      
public class Assignment14 {
	static void area(){
		double pi=3.141;
		System.out.println(pi);
	}
	static void circumferance() {
		int r=10;
		double pi=3.14;
		double cf=2*pi*r;
		System.out.println(cf);
		
		
	}
	public static void main(String[] args) {
		area();
		circumferance() ;

	}

}
