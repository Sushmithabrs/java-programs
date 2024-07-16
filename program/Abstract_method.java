package program;

abstract class sushmitha{
	abstract void add();
	abstract void mul();
    void sub() {
    System.out.println("Concrete method1");
}
    void div() {
	System.out.println("concrete method two");
}}
public class Abstract_method extends sushmitha{

	@Override
	void add() {
		System.out.println("addition");
		}
    @Override
	void mul() {
		System.out.println("multiplication");}
	static void city_name() {
		System.out.println("Banglore");
	}
	static void state_name() {
		System.out.println("karnataka");
		
	}
	public static void main(String[] args) {
		
		Abstract_method ac= new Abstract_method();
		ac.add();
		ac.mul();
		ac.sub();ac.div();
		Abstract_method.city_name();
		Abstract_method.state_name();
		
		}}


