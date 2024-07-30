package assignment;

abstract class Sushmitha {
	abstract void add();
	abstract void sub();
}
public class Abstract_Class extends Sushmitha {
	


	@Override
	void add() {
		System.out.println("add two numbers");
		
	}

	@Override
	void sub() {
		System.out.println("substract two numbers");
		
	}
	public static void main(String[] args) {
		Abstract_Class ac=new Abstract_Class();
		ac.add();
		ac.sub();
}
}