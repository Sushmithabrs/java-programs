package program;
class Sushmitha
{
 void add() {
	int a=10;
	int b=30;
	System.out.println(a+b);
}
 void sub() {
		int a=40;
		int b=10;
		System.out.println(a-b);

}}
class Urvik extends Sushmitha{
    void mul() {
	int a=20;
	int b=30;
	System.out.println(a*b);
	

}

    void div() {
	float a=3.24f;
	double b=5.87;
	System.out.println(a/b);
}

}
public class Multilevel_Nonstatic extends Urvik{
	    void mod() {
		int a=20;
		int b=30;
		System.out.println(a%b);
}

	public static void main(String[] args) {
		Multilevel_Nonstatic mn=new Multilevel_Nonstatic();
		mn.add();
		mn.sub();
		mn.mul();
		mn.div();
		mn.mod();

	}

}
