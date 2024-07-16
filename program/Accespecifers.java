package program;
//Write a program for what happens within class (as per class 17)

public class Accespecifers {
	
public static void Add(){
	System.out.println("addition");
}
private	static void sub() {
	System.out.println("substraction");
}
protected static void mul() {
	System.out.println("multiplication");
}

static void mod() {
	System.out.println("modulus");
}
	public static void main(String[] args) {
		Add();
		sub();
		mul();
		mod();
	}

}
